import com.google.common.primitives.Ints;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.PrivateKey;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class alt implements adm, tc {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private static final tn d = tn.c("multiplayer.disconnect.unexpected_query_response");
   private final byte[] e;
   final MinecraftServer f;
   final so g;
   private volatile alt.a h = alt.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";

   public alt(MinecraftServer $$0, so $$1) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(ase.a().f());
   }

   @Override
   public void e() {
      if (this.h == alt.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == alt.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.b(tn.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.k();
   }

   public void b(tn $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.g.a(new adl($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ac().a($$0.getId()) != null;
   }

   @Override
   public void a(tn $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   public String f() {
      String $$0 = this.g.a(this.f.be());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(ado $$0) {
      Validate.validState(this.h == alt.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(a($$0.a()), "Invalid characters in username", new Object[0]);
      this.j = $$0.a();
      GameProfile $$1 = this.f.N();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.U() && !this.g.g()) {
            this.h = alt.a.b;
            this.g.a(new adj("", this.f.L().getPublic().getEncoded(), this.e));
         } else {
            this.b(b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = alt.a.e;
   }

   private void c(GameProfile $$0) {
      aoi $$1 = this.f.ac();
      tn $$2 = $$1.a(this.g.f(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.av() >= 0 && !this.g.g()) {
            this.g.a(new adk(this.f.av()), sx.a(() -> this.g.a(this.f.av(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = alt.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = alt.a.g;
      this.g.a(new adi($$0));
   }

   public static boolean a(String $$0) {
      return $$0.chars().filter($$0x -> $$0x <= 32 || $$0x >= 127).findAny().isEmpty();
   }

   @Override
   public void a(adp $$0) {
      Validate.validState(this.h == alt.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.L().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = aqy.a(2, $$2);
         Cipher $$4 = aqy.a(1, $$2);
         $$5 = new BigInteger(aqy.a("", this.f.L().getPublic(), $$2)).toString(16);
         this.h = alt.a.c;
         this.g.a($$3, $$4);
      } catch (aqz var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(alt.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = alt.this.f.am().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  alt.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  alt.this.b($$2);
               } else if (alt.this.f.O()) {
                  alt.b.warn("Failed to verify username but will let them in anyway!");
                  alt.this.b(alt.b($$0));
               } else {
                  alt.this.b(tn.c("multiplayer.disconnect.unverified_username"));
                  alt.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (alt.this.f.O()) {
                  alt.b.warn("Authentication servers are down but will let them in anyway!");
                  alt.this.b(alt.b($$0));
               } else {
                  alt.this.b(tn.c("multiplayer.disconnect.authservers_down"));
                  alt.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = alt.this.g.f();
            return alt.this.f.V() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(adn $$0) {
      this.b(d);
   }

   @Override
   public void a(adq $$0) {
      Validate.validState(this.h == alt.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      alh $$1 = alh.a(Objects.requireNonNull(this.k));
      alp $$2 = new alp(this.f, this.g, $$1);
      this.g.a($$2);
      $$2.m();
      this.h = alt.a.h;
   }

   protected static GameProfile b(String $$0) {
      UUID $$1 = ia.a($$0);
      return new GameProfile($$1, $$0);
   }

   static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;
   }
}
