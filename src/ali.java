import com.google.common.primitives.Ints;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
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

public class ali implements add, st {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private static final te d = te.c("multiplayer.disconnect.unexpected_query_response");
   private final byte[] e;
   final MinecraftServer f;
   final sf g;
   private volatile ali.a h = ali.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";

   public ali(MinecraftServer $$0, sf $$1) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(art.a().f());
   }

   @Override
   public void e() {
      if (this.h == ali.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == ali.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.b(te.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.k();
   }

   public void b(te $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.g.a(new adc($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ac().a($$0.getId()) != null;
   }

   @Override
   public void a(te $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   public String f() {
      String $$0 = this.g.a(this.f.bf());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(adf $$0) {
      Validate.validState(this.h == ali.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(a($$0.a()), "Invalid characters in username", new Object[0]);
      this.j = $$0.a();
      GameProfile $$1 = this.f.N();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.U() && !this.g.g()) {
            this.h = ali.a.b;
            this.g.a(new ada("", this.f.L().getPublic().getEncoded(), this.e));
         } else {
            this.b(b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = ali.a.e;
   }

   private void c(GameProfile $$0) {
      anx $$1 = this.f.ac();
      te $$2 = $$1.a(this.g.f(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.av() >= 0 && !this.g.g()) {
            this.g.a(new adb(this.f.av()), so.a(() -> this.g.a(this.f.av(), true)));
         }

         boolean $$3 = $$1.f($$0);
         if ($$3) {
            this.h = ali.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = ali.a.g;
      this.g.a(new acz($$0));
   }

   public static boolean a(String $$0) {
      return $$0.chars().filter($$0x -> $$0x <= 32 || $$0x >= 127).findAny().isEmpty();
   }

   @Override
   public void a(adg $$0) {
      Validate.validState(this.h == ali.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.L().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = aqn.a(2, $$2);
         Cipher $$4 = aqn.a(1, $$2);
         $$5 = new BigInteger(aqn.a("", this.f.L().getPublic(), $$2)).toString(16);
         this.h = ali.a.c;
         this.g.a($$3, $$4);
      } catch (aqo var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(ali.this.j, "Player name not initialized");

            try {
               GameProfile $$1 = ali.this.f.am().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  ali.b.info("UUID of player {} is {}", $$1.getName(), $$1.getId());
                  ali.this.b($$1);
               } else if (ali.this.f.O()) {
                  ali.b.warn("Failed to verify username but will let them in anyway!");
                  ali.this.b(ali.b($$0));
               } else {
                  ali.this.b(te.c("multiplayer.disconnect.unverified_username"));
                  ali.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var3) {
               if (ali.this.f.O()) {
                  ali.b.warn("Authentication servers are down but will let them in anyway!");
                  ali.this.b(ali.b($$0));
               } else {
                  ali.this.b(te.c("multiplayer.disconnect.authservers_down"));
                  ali.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = ali.this.g.f();
            return ali.this.f.V() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(ade $$0) {
      this.b(d);
   }

   @Override
   public void a(adh $$0) {
      Validate.validState(this.h == ali.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      ale $$1 = new ale(this.f, this.g, Objects.requireNonNull(this.k));
      this.g.a($$1);
      $$1.l();
      this.h = ali.a.h;
   }

   protected static GameProfile b(String $$0) {
      UUID $$1 = hz.a($$0);
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
