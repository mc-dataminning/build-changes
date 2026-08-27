import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.ForcedUsernameChangeException;
import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.UserBannedException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.security.PublicKey;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.client.ClientBrandRetriever;
import org.slf4j.Logger;

public class fln implements aes {
   private static final Logger a = LogUtils.getLogger();
   private final eti b;
   @Nullable
   private final flz c;
   @Nullable
   private final faz d;
   private final Consumer<uv> e;
   private final tw f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final AtomicReference<fln.a> j = new AtomicReference<>(fln.a.a);

   public fln(tw $$0, eti $$1, @Nullable flz $$2, @Nullable faz $$3, boolean $$4, @Nullable Duration $$5, Consumer<uv> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
   }

   private void a(fln.a $$0) {
      fln.a $$1 = this.j.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(aev $$0) {
      this.a(fln.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      afb $$7;
      try {
         SecretKey $$1 = asp.a();
         PublicKey $$2 = $$0.d();
         $$3 = new BigInteger(asp.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = asp.a(2, $$1);
         $$5 = asp.a(1, $$1);
         byte[] $$6 = $$0.e();
         $$7 = new afb($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      ath.a.submit(() -> {
         uv $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.a(fln.a.c);
         this.f.a($$7, uf.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private uv b(String $$0) {
      try {
         this.e().joinServer(this.b.U().b(), this.b.U().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return uv.a("disconnect.loginFailedInfo", uv.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return uv.a("disconnect.loginFailedInfo", uv.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return uv.a("disconnect.loginFailedInfo", uv.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return uv.a("disconnect.loginFailedInfo", uv.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return uv.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.aj();
   }

   @Override
   public void a(aeu $$0) {
      this.a(fln.a.d);
      GameProfile $$1 = $$0.a();
      this.f.a(new afc());
      this.f.a(new flm(this.b, this.f, new fls($$1, this.b.t().a(this.g, this.h, this.i), flq.a().a(), cgk.h, null, this.c, this.d)));
      this.f.a(new xa(new xg(ClientBrandRetriever.getClientModName())));
      this.f.a(new wz(this.b.m.at()));
   }

   @Override
   public void a(uv $$0) {
      if (this.c != null && this.c.e()) {
         this.b.a(new ghs(this.d, uu.q, $$0));
      } else {
         this.b.a(new fab(this.d, uu.q, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.k();
   }

   @Override
   public void a(aex $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(aew $$0) {
      if (!this.f.g()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(aet $$0) {
      this.e.accept(uv.c("connect.negotiating"));
      this.f.a(new aez($$0.a(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }

   static enum a {
      a(uv.c("connect.connecting"), Set.of()),
      b(uv.c("connect.authorizing"), Set.of(a)),
      c(uv.c("connect.encrypting"), Set.of(b)),
      d(uv.c("connect.joining"), Set.of(c, a));

      final uv e;
      final Set<fln.a> f;

      private a(uv $$0, Set<fln.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
