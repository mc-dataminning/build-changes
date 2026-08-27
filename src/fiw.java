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

public class fiw implements ade {
   private static final Logger a = LogUtils.getLogger();
   private final eqv b;
   @Nullable
   private final fjh c;
   @Nullable
   private final eyk d;
   private final Consumer<tl> e;
   private final sm f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final AtomicReference<fiw.a> j = new AtomicReference<>(fiw.a.a);

   public fiw(sm $$0, eqv $$1, @Nullable fjh $$2, @Nullable eyk $$3, boolean $$4, @Nullable Duration $$5, Consumer<tl> $$6) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
   }

   private void a(fiw.a $$0) {
      fiw.a $$1 = this.j.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(adh $$0) {
      this.a(fiw.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      adn $$7;
      try {
         SecretKey $$1 = aqw.a();
         PublicKey $$2 = $$0.d();
         $$3 = new BigInteger(aqw.a($$0.a(), $$2, $$1)).toString(16);
         $$4 = aqw.a(2, $$1);
         $$5 = aqw.a(1, $$1);
         byte[] $$6 = $$0.e();
         $$7 = new adn($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      aro.a.submit(() -> {
         tl $$4x = this.b($$3);
         if ($$4x != null) {
            if (this.c == null || !this.c.d()) {
               this.f.a($$4x);
               return;
            }

            a.warn($$4x.getString());
         }

         this.a(fiw.a.c);
         this.f.a($$7, sv.a(() -> this.f.a($$4, $$5)));
      });
   }

   @Nullable
   private tl b(String $$0) {
      try {
         this.e().joinServer(this.b.V().b(), this.b.V().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return tl.a("disconnect.loginFailedInfo", tl.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return tl.a("disconnect.loginFailedInfo", tl.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return tl.a("disconnect.loginFailedInfo", tl.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return tl.a("disconnect.loginFailedInfo", tl.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return tl.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.ak();
   }

   @Override
   public void a(adg $$0) {
      this.a(fiw.a.d);
      GameProfile $$1 = $$0.a();
      this.f.a(new ado());
      this.f.a(new fiv(this.b, this.f, new fjb($$1, this.b.u().a(this.g, this.h, this.i), fiz.a().a(), cee.g, null, this.c, this.d)));
      this.f.a(new vp(new vv(ClientBrandRetriever.getClientModName())));
      this.f.a(new vo(this.b.m.as()));
   }

   @Override
   public void a(tl $$0) {
      if (this.c != null && this.c.e()) {
         this.b.a(new gex(this.d, tk.q, $$0));
      } else {
         this.b.a(new exm(this.d, tk.q, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.k();
   }

   @Override
   public void a(adj $$0) {
      this.f.a($$0.a());
   }

   @Override
   public void a(adi $$0) {
      if (!this.f.g()) {
         this.f.a($$0.a(), false);
      }
   }

   @Override
   public void a(adf $$0) {
      this.e.accept(tl.c("connect.negotiating"));
      this.f.a(new adl($$0.a(), null));
   }

   public void a(String $$0) {
      this.i = $$0;
   }

   static enum a {
      a(tl.c("connect.connecting"), Set.of()),
      b(tl.c("connect.authorizing"), Set.of(a)),
      c(tl.c("connect.encrypting"), Set.of(b)),
      d(tl.c("connect.joining"), Set.of(c, a));

      final tl e;
      final Set<fiw.a> f;

      private a(tl $$0, Set<fiw.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
