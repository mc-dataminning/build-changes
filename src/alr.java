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

public class alr implements adk, ta {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private static final tl d = tl.c("multiplayer.disconnect.unexpected_query_response");
   private final byte[] e;
   final MinecraftServer f;
   final sm g;
   private volatile alr.a h = alr.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";

   public alr(MinecraftServer $$0, sm $$1) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(asc.a().f());
   }

   @Override
   public void e() {
      if (this.h == alr.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == alr.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.b(tl.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.k();
   }

   public void b(tl $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.g.a(new adj($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ac().a($$0.getId()) != null;
   }

   @Override
   public void a(tl $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   public String f() {
      String $$0 = this.g.a(this.f.be());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(adm $$0) {
      Validate.validState(this.h == alr.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(a($$0.a()), "Invalid characters in username", new Object[0]);
      this.j = $$0.a();
      GameProfile $$1 = this.f.N();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.U() && !this.g.g()) {
            this.h = alr.a.b;
            this.g.a(new adh("", this.f.L().getPublic().getEncoded(), this.e));
         } else {
            this.b(b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = alr.a.e;
   }

   private void c(GameProfile $$0) {
      aog $$1 = this.f.ac();
      tl $$2 = $$1.a(this.g.f(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.av() >= 0 && !this.g.g()) {
            this.g.a(new adi(this.f.av()), sv.a(() -> this.g.a(this.f.av(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = alr.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = alr.a.g;
      this.g.a(new adg($$0));
   }

   public static boolean a(String $$0) {
      return $$0.chars().filter($$0x -> $$0x <= 32 || $$0x >= 127).findAny().isEmpty();
   }

   @Override
   public void a(adn $$0) {
      Validate.validState(this.h == alr.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.L().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = aqw.a(2, $$2);
         Cipher $$4 = aqw.a(1, $$2);
         $$5 = new BigInteger(aqw.a("", this.f.L().getPublic(), $$2)).toString(16);
         this.h = alr.a.c;
         this.g.a($$3, $$4);
      } catch (aqx var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(alr.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = alr.this.f.am().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  alr.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  alr.this.b($$2);
               } else if (alr.this.f.O()) {
                  alr.b.warn("Failed to verify username but will let them in anyway!");
                  alr.this.b(alr.b($$0));
               } else {
                  alr.this.b(tl.c("multiplayer.disconnect.unverified_username"));
                  alr.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (alr.this.f.O()) {
                  alr.b.warn("Authentication servers are down but will let them in anyway!");
                  alr.this.b(alr.b($$0));
               } else {
                  alr.this.b(tl.c("multiplayer.disconnect.authservers_down"));
                  alr.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = alr.this.g.f();
            return alr.this.f.V() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(adl $$0) {
      this.b(d);
   }

   @Override
   public void a(ado $$0) {
      Validate.validState(this.h == alr.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      alf $$1 = alf.a(Objects.requireNonNull(this.k));
      aln $$2 = new aln(this.f, this.g, $$1);
      this.g.a($$2);
      $$2.m();
      this.h = alr.a.h;
   }

   protected static GameProfile b(String $$0) {
      UUID $$1 = hx.a($$0);
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
