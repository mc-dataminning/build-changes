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
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class aoe implements afs, uu {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private static final vf d = vf.c("multiplayer.disconnect.unexpected_query_response");
   private final byte[] e;
   final MinecraftServer f;
   final ug g;
   private volatile aoe.a h = aoe.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";

   public aoe(MinecraftServer $$0, ug $$1) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(auv.a().f());
   }

   @Override
   public void e() {
      if (this.h == aoe.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == aoe.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.b(vf.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.k();
   }

   public void b(vf $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.g.a(new afr($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ae().a($$0.getId()) != null;
   }

   @Override
   public void a(vf $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   @Override
   public String f() {
      String $$0 = this.g.a(this.f.bj());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(afu $$0) {
      Validate.validState(this.h == aoe.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(cfi.c($$0.a()), "Invalid characters in username", new Object[0]);
      this.j = $$0.a();
      GameProfile $$1 = this.f.P();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.W() && !this.g.g()) {
            this.h = aoe.a.b;
            this.g.a(new afp("", this.f.N().getPublic().getEncoded(), this.e));
         } else {
            this.b(ja.b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = aoe.a.e;
   }

   private void c(GameProfile $$0) {
      aqv $$1 = this.f.ae();
      vf $$2 = $$1.a(this.g.f(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.ax() >= 0 && !this.g.g()) {
            this.g.a(new afq(this.f.ax()), up.a(() -> this.g.a(this.f.ax(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = aoe.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = aoe.a.g;
      this.g.a(new afo($$0));
   }

   @Override
   public void a(afv $$0) {
      Validate.validState(this.h == aoe.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.N().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = atm.a(2, $$2);
         Cipher $$4 = atm.a(1, $$2);
         $$5 = new BigInteger(atm.a("", this.f.N().getPublic(), $$2)).toString(16);
         this.h = aoe.a.c;
         this.g.a($$3, $$4);
      } catch (atn var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(aoe.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = aoe.this.f.ao().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  aoe.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  aoe.this.b($$2);
               } else if (aoe.this.f.Q()) {
                  aoe.b.warn("Failed to verify username but will let them in anyway!");
                  aoe.this.b(ja.b($$0));
               } else {
                  aoe.this.b(vf.c("multiplayer.disconnect.unverified_username"));
                  aoe.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (aoe.this.f.Q()) {
                  aoe.b.warn("Authentication servers are down but will let them in anyway!");
                  aoe.this.b(ja.b($$0));
               } else {
                  aoe.this.b(vf.c("multiplayer.disconnect.authservers_down"));
                  aoe.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = aoe.this.g.f();
            return aoe.this.f.X() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(aft $$0) {
      this.b(d);
   }

   @Override
   public void a(afw $$0) {
      Validate.validState(this.h == aoe.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      ans $$1 = ans.a(Objects.requireNonNull(this.k));
      aoa $$2 = new aoa(this.f, this.g, $$1);
      this.g.a($$2);
      $$2.m();
      this.h = aoe.a.h;
   }

   @Override
   public void a(p $$0) {
      $$0.a("Login phase", () -> this.h.toString());
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
