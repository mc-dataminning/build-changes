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

public class fnp implements afm {
   private static final Logger a = LogUtils.getLogger();
   private final evg b;
   @Nullable
   private final fob c;
   @Nullable
   private final fcz d;
   private final Consumer<vf> e;
   private final ug f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final AtomicReference<fnp.a> j = new AtomicReference<>(fnp.a.a);

   public fnp(ug $$0, evg $$1, @Nullable fob $$2, @Nullable fcz $$3, boolean $$4, @Nullable Duration $$5, Consumer<vf> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
   }

   private void a(fnp.a $$0) {
      fnp.a $$1 = this.j.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(afp $$0) {
      this.a(fnp.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      afv $$7;
      try {
         SecretKey $$1 = atl.a();
         PublicKey $$2 = $$0.d();
         $$3 = new BigInteger(atl.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = atl.a(2, $$1);
         $$5 = atl.a(1, $$1);
         byte[] $$6 = $$0.e();
         $$7 = new afv($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      ac.g().submit(() -> {
         vf $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.a(fnp.a.c);
         this.f.a($$7, up.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private vf b(String $$0) {
      try {
         this.e().joinServer(this.b.V().b(), this.b.V().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return vf.a("disconnect.loginFailedInfo", vf.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return vf.a("disconnect.loginFailedInfo", vf.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return vf.a("disconnect.loginFailedInfo", vf.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return vf.a("disconnect.loginFailedInfo", vf.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return vf.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.ak();
   }

   @Override
   public void a(afo $$0) {
      this.a(fnp.a.d);
      GameProfile $$1 = $$0.a();
      this.f.a(new afw());
      this.f.a(new fno(this.b, this.f, new fnu($$1, this.b.t().a(this.g, this.h, this.i), fns.a().a(), cht.h, null, this.c, this.d)));
      this.f.a(new xs(new xy(ClientBrandRetriever.getClientModName())));
      this.f.a(new xr(this.b.m.at()));
   }

   @Override
   public void a(vf $$0) {
      if (this.c != null && this.c.e()) {
         this.b.a(new gkj(this.d, ve.q, $$0));
      } else {
         this.b.a(new fcb(this.d, ve.q, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.k();
   }

   @Override
   public void a(afr $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(afq $$0) {
      if (!this.f.g()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(afn $$0) {
      this.e.accept(vf.c("connect.negotiating"));
      this.f.a(new aft($$0.a(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }

   static enum a {
      a(vf.c("connect.connecting"), Set.of()),
      b(vf.c("connect.authorizing"), Set.of(a)),
      c(vf.c("connect.encrypting"), Set.of(b)),
      d(vf.c("connect.joining"), Set.of(c, a));

      final vf e;
      final Set<fnp.a> f;

      private a(vf $$0, Set<fnp.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
