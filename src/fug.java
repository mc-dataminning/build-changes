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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.client.ClientBrandRetriever;
import org.slf4j.Logger;

public class fug implements ahq {
   private static final Logger a = LogUtils.getLogger();
   private final fbp b;
   @Nullable
   private final fuv c;
   @Nullable
   private final fjo d;
   private final Consumer<wg> e;
   private final ve f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<ajt, byte[]> j;
   private final boolean k;
   private final AtomicReference<fug.a> l = new AtomicReference<>(fug.a.a);

   public fug(ve $$0, fbp $$1, @Nullable fuv $$2, @Nullable fjo $$3, boolean $$4, @Nullable Duration $$5, Consumer<wg> $$6, @Nullable fuz $$7) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
      this.j = $$7 != null ? new HashMap<>($$7.a()) : new HashMap<>();
      this.k = $$7 != null;
   }

   private void a(fug.a $$0) {
      fug.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(aht $$0) {
      this.a(fug.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      aib $$7;
      try {
         SecretKey $$1 = awi.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(awi.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = awi.a(2, $$1);
         $$5 = awi.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new aib($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ac.g().submit(() -> {
            wg $$4x = this.b($$3);
            if ($$4x != null) {
               if (this.c == null || !this.c.d()) {
                  this.f.a($$4x);
                  return;
               }

               a.warn($$4x.getString());
            }

            this.a($$7, $$4, $$5);
         });
      } else {
         this.a($$7, $$4, $$5);
      }
   }

   private void a(aib $$0, Cipher $$1, Cipher $$2) {
      this.a(fug.a.c);
      this.f.a($$0, vn.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private wg b(String $$0) {
      try {
         this.e().joinServer(this.b.X().b(), this.b.X().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return wg.a("disconnect.loginFailedInfo", wg.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return wg.a("disconnect.loginFailedInfo", wg.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return wg.a("disconnect.loginFailedInfo", wg.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return wg.a("disconnect.loginFailedInfo", wg.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return wg.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.am();
   }

   @Override
   public void a(ahs $$0) {
      this.a(fug.a.d);
      GameProfile $$1 = $$0.b();
      this.f.a(aan.b, new fuf(this.b, this.f, new ful($$1, this.b.u().a(this.g, this.h, this.i), fuj.a().a(), cmi.h, null, this.c, this.d, this.j)));
      this.f.a(aic.a);
      this.f.a(aan.a);
      this.f.a(new zg(new zm(ClientBrandRetriever.getClientModName())));
      this.f.a(new zf(this.b.m.aw()));
   }

   @Override
   public void a(wg $$0) {
      wg $$1 = this.k ? wf.q : wf.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new grh(this.d, $$1, $$0));
      } else {
         this.b.a(new fip(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ahv $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ahu $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahr $$0) {
      this.e.accept(wg.c("connect.negotiating"));
      this.f.a(new ahz($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(aat $$0) {
      this.f.a(new aaw($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$0.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(wg.c("connect.connecting"), Set.of()),
      b(wg.c("connect.authorizing"), Set.of(a)),
      c(wg.c("connect.encrypting"), Set.of(b)),
      d(wg.c("connect.joining"), Set.of(c, a));

      final wg e;
      final Set<fug.a> f;

      private a(wg $$0, Set<fug.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
