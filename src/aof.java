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

public class aof implements aft, uv {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private static final vg d = vg.c("multiplayer.disconnect.unexpected_query_response");
   private final byte[] e;
   final MinecraftServer f;
   final uh g;
   private volatile aof.a h = aof.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";

   public aof(MinecraftServer $$0, uh $$1) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(auw.a().f());
   }

   @Override
   public void e() {
      if (this.h == aof.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == aof.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.b(vg.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.k();
   }

   public void b(vg $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.g.a(new afs($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ae().a($$0.getId()) != null;
   }

   @Override
   public void a(vg $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   @Override
   public String f() {
      String $$0 = this.g.a(this.f.bj());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(afv $$0) {
      Validate.validState(this.h == aof.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(cfq.c($$0.a()), "Invalid characters in username", new Object[0]);
      this.j = $$0.a();
      GameProfile $$1 = this.f.P();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.W() && !this.g.g()) {
            this.h = aof.a.b;
            this.g.a(new afq("", this.f.N().getPublic().getEncoded(), this.e));
         } else {
            this.b(ja.b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = aof.a.e;
   }

   private void c(GameProfile $$0) {
      aqw $$1 = this.f.ae();
      vg $$2 = $$1.a(this.g.f(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.ax() >= 0 && !this.g.g()) {
            this.g.a(new afr(this.f.ax()), uq.a(() -> this.g.a(this.f.ax(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = aof.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = aof.a.g;
      this.g.a(new afp($$0));
   }

   @Override
   public void a(afw $$0) {
      Validate.validState(this.h == aof.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.N().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = atn.a(2, $$2);
         Cipher $$4 = atn.a(1, $$2);
         $$5 = new BigInteger(atn.a("", this.f.N().getPublic(), $$2)).toString(16);
         this.h = aof.a.c;
         this.g.a($$3, $$4);
      } catch (ato var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(aof.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = aof.this.f.ao().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  aof.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  aof.this.b($$2);
               } else if (aof.this.f.Q()) {
                  aof.b.warn("Failed to verify username but will let them in anyway!");
                  aof.this.b(ja.b($$0));
               } else {
                  aof.this.b(vg.c("multiplayer.disconnect.unverified_username"));
                  aof.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (aof.this.f.Q()) {
                  aof.b.warn("Authentication servers are down but will let them in anyway!");
                  aof.this.b(ja.b($$0));
               } else {
                  aof.this.b(vg.c("multiplayer.disconnect.authservers_down"));
                  aof.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = aof.this.g.f();
            return aof.this.f.X() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(afu $$0) {
      this.b(d);
   }

   @Override
   public void a(afx $$0) {
      Validate.validState(this.h == aof.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      ant $$1 = ant.a(Objects.requireNonNull(this.k));
      aob $$2 = new aob(this.f, this.g, $$1);
      this.g.a($$2);
      $$2.m();
      this.h = aof.a.h;
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
