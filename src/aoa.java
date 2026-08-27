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

public class aoa implements afp, us {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private static final vd d = vd.c("multiplayer.disconnect.unexpected_query_response");
   private final byte[] e;
   final MinecraftServer f;
   final ue g;
   private volatile aoa.a h = aoa.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";

   public aoa(MinecraftServer $$0, ue $$1) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(aup.a().f());
   }

   @Override
   public void e() {
      if (this.h == aoa.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == aoa.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.b(vd.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.k();
   }

   public void b(vd $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.g.a(new afo($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ae().a($$0.getId()) != null;
   }

   @Override
   public void a(vd $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   public String f() {
      String $$0 = this.g.a(this.f.bj());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(afr $$0) {
      Validate.validState(this.h == aoa.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(cfb.c($$0.a()), "Invalid characters in username", new Object[0]);
      this.j = $$0.a();
      GameProfile $$1 = this.f.P();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.W() && !this.g.g()) {
            this.h = aoa.a.b;
            this.g.a(new afm("", this.f.N().getPublic().getEncoded(), this.e));
         } else {
            this.b(ja.b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = aoa.a.e;
   }

   private void c(GameProfile $$0) {
      aqp $$1 = this.f.ae();
      vd $$2 = $$1.a(this.g.f(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.ax() >= 0 && !this.g.g()) {
            this.g.a(new afn(this.f.ax()), un.a(() -> this.g.a(this.f.ax(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = aoa.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = aoa.a.g;
      this.g.a(new afl($$0));
   }

   @Override
   public void a(afs $$0) {
      Validate.validState(this.h == aoa.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.N().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = atg.a(2, $$2);
         Cipher $$4 = atg.a(1, $$2);
         $$5 = new BigInteger(atg.a("", this.f.N().getPublic(), $$2)).toString(16);
         this.h = aoa.a.c;
         this.g.a($$3, $$4);
      } catch (ath var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(aoa.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = aoa.this.f.ao().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  aoa.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  aoa.this.b($$2);
               } else if (aoa.this.f.Q()) {
                  aoa.b.warn("Failed to verify username but will let them in anyway!");
                  aoa.this.b(ja.b($$0));
               } else {
                  aoa.this.b(vd.c("multiplayer.disconnect.unverified_username"));
                  aoa.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (aoa.this.f.Q()) {
                  aoa.b.warn("Authentication servers are down but will let them in anyway!");
                  aoa.this.b(ja.b($$0));
               } else {
                  aoa.this.b(vd.c("multiplayer.disconnect.authservers_down"));
                  aoa.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = aoa.this.g.f();
            return aoa.this.f.X() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(afq $$0) {
      this.b(d);
   }

   @Override
   public void a(aft $$0) {
      Validate.validState(this.h == aoa.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      ano $$1 = ano.a(Objects.requireNonNull(this.k));
      anw $$2 = new anw(this.f, this.g, $$1);
      this.g.a($$2);
      $$2.m();
      this.h = aoa.a.h;
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
