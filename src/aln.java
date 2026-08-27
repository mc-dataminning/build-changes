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

public class aln implements adi, sx {
   private static final AtomicInteger a = new AtomicInteger(0);
   static final Logger b = LogUtils.getLogger();
   private static final int c = 600;
   private static final ti d = ti.c("multiplayer.disconnect.unexpected_query_response");
   private final byte[] e;
   final MinecraftServer f;
   final sj g;
   private volatile aln.a h = aln.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";

   public aln(MinecraftServer $$0, sj $$1) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(arx.a().f());
   }

   @Override
   public void e() {
      if (this.h == aln.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == aln.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.b(ti.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.k();
   }

   public void b(ti $$0) {
      try {
         b.info("Disconnecting {}: {}", this.f(), $$0.getString());
         this.g.a(new adh($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         b.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ac().a($$0.getId()) != null;
   }

   @Override
   public void a(ti $$0) {
      b.info("{} lost connection: {}", this.f(), $$0.getString());
   }

   public String f() {
      String $$0 = this.g.a(this.f.be());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(adk $$0) {
      Validate.validState(this.h == aln.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(a($$0.a()), "Invalid characters in username", new Object[0]);
      this.j = $$0.a();
      GameProfile $$1 = this.f.N();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.U() && !this.g.g()) {
            this.h = aln.a.b;
            this.g.a(new adf("", this.f.L().getPublic().getEncoded(), this.e));
         } else {
            this.b(b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = aln.a.e;
   }

   private void c(GameProfile $$0) {
      aoc $$1 = this.f.ac();
      ti $$2 = $$1.a(this.g.f(), $$0);
      if ($$2 != null) {
         this.b($$2);
      } else {
         if (this.f.av() >= 0 && !this.g.g()) {
            this.g.a(new adg(this.f.av()), ss.a(() -> this.g.a(this.f.av(), true)));
         }

         boolean $$3 = $$1.f($$0);
         if ($$3) {
            this.h = aln.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = aln.a.g;
      this.g.a(new ade($$0));
   }

   public static boolean a(String $$0) {
      return $$0.chars().filter($$0x -> $$0x <= 32 || $$0x >= 127).findAny().isEmpty();
   }

   @Override
   public void a(adl $$0) {
      Validate.validState(this.h == aln.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.L().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = aqs.a(2, $$2);
         Cipher $$4 = aqs.a(1, $$2);
         $$5 = new BigInteger(aqs.a("", this.f.L().getPublic(), $$2)).toString(16);
         this.h = aln.a.c;
         this.g.a($$3, $$4);
      } catch (aqt var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + a.incrementAndGet()) {
         @Override
         public void run() {
            String $$0 = Objects.requireNonNull(aln.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = aln.this.f.am().hasJoinedServer($$0, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  aln.b.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  aln.this.b($$2);
               } else if (aln.this.f.O()) {
                  aln.b.warn("Failed to verify username but will let them in anyway!");
                  aln.this.b(aln.b($$0));
               } else {
                  aln.this.b(ti.c("multiplayer.disconnect.unverified_username"));
                  aln.b.error("Username '{}' tried to join with an invalid session", $$0);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (aln.this.f.O()) {
                  aln.b.warn("Authentication servers are down but will let them in anyway!");
                  aln.this.b(aln.b($$0));
               } else {
                  aln.this.b(ti.c("multiplayer.disconnect.authservers_down"));
                  aln.b.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0 = aln.this.g.f();
            return aln.this.f.V() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new r(b));
      $$8.start();
   }

   @Override
   public void a(adj $$0) {
      this.b(d);
   }

   @Override
   public void a(adm $$0) {
      Validate.validState(this.h == aln.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      alj $$1 = new alj(this.f, this.g, Objects.requireNonNull(this.k));
      this.g.a($$1);
      $$1.m();
      this.h = aln.a.h;
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
