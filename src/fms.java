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

public class fms implements aez {
   private static final Logger a = LogUtils.getLogger();
   private final euk b;
   @Nullable
   private final fne c;
   @Nullable
   private final fcc d;
   private final Consumer<vb> e;
   private final uc f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final AtomicReference<fms.a> j = new AtomicReference<>(fms.a.a);

   public fms(uc $$0, euk $$1, @Nullable fne $$2, @Nullable fcc $$3, boolean $$4, @Nullable Duration $$5, Consumer<vb> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
   }

   private void a(fms.a $$0) {
      fms.a $$1 = this.j.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(afc $$0) {
      this.a(fms.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      afi $$7;
      try {
         SecretKey $$1 = asw.a();
         PublicKey $$2 = $$0.d();
         $$3 = new BigInteger(asw.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = asw.a(2, $$1);
         $$5 = asw.a(1, $$1);
         byte[] $$6 = $$0.e();
         $$7 = new afi($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      atp.a.submit(() -> {
         vb $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.a(fms.a.c);
         this.f.a($$7, ul.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private vb b(String $$0) {
      try {
         this.e().joinServer(this.b.U().b(), this.b.U().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return vb.a("disconnect.loginFailedInfo", vb.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return vb.a("disconnect.loginFailedInfo", vb.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return vb.a("disconnect.loginFailedInfo", vb.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return vb.a("disconnect.loginFailedInfo", vb.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return vb.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.aj();
   }

   @Override
   public void a(afb $$0) {
      this.a(fms.a.d);
      GameProfile $$1 = $$0.a();
      this.f.a(new afj());
      this.f.a(new fmr(this.b, this.f, new fmx($$1, this.b.t().a(this.g, this.h, this.i), fmv.a().a(), chd.h, null, this.c, this.d)));
      this.f.a(new xg(new xm(ClientBrandRetriever.getClientModName())));
      this.f.a(new xf(this.b.m.at()));
   }

   @Override
   public void a(vb $$0) {
      if (this.c != null && this.c.e()) {
         this.b.a(new gjh(this.d, va.q, $$0));
      } else {
         this.b.a(new fbe(this.d, va.q, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.k();
   }

   @Override
   public void a(afe $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(afd $$0) {
      if (!this.f.g()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(afa $$0) {
      this.e.accept(vb.c("connect.negotiating"));
      this.f.a(new afg($$0.a(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }

   static enum a {
      a(vb.c("connect.connecting"), Set.of()),
      b(vb.c("connect.authorizing"), Set.of(a)),
      c(vb.c("connect.encrypting"), Set.of(b)),
      d(vb.c("connect.joining"), Set.of(c, a));

      final vb e;
      final Set<fms.a> f;

      private a(vb $$0, Set<fms.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
