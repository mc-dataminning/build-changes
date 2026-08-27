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

public class fqz implements aha {
   private static final Logger a = LogUtils.getLogger();
   private final eyk b;
   @Nullable
   private final frn c;
   @Nullable
   private final fgh d;
   private final Consumer<vs> e;
   private final uq f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<ajc, byte[]> j;
   private final boolean k;
   private final AtomicReference<fqz.a> l = new AtomicReference<>(fqz.a.a);

   public fqz(uq $$0, eyk $$1, @Nullable frn $$2, @Nullable fgh $$3, boolean $$4, @Nullable Duration $$5, Consumer<vs> $$6, @Nullable frq $$7) {
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

   private void a(fqz.a $$0) {
      fqz.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(ahd $$0) {
      this.a(fqz.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      ahl $$7;
      try {
         SecretKey $$1 = avk.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(avk.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = avk.a(2, $$1);
         $$5 = avk.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new ahl($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ac.g().submit(() -> {
            vs $$4x = this.b($$3);
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

   private void a(ahl $$0, Cipher $$1, Cipher $$2) {
      this.a(fqz.a.c);
      this.f.a($$0, uz.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private vs b(String $$0) {
      try {
         this.e().joinServer(this.b.W().b(), this.b.W().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return vs.a("disconnect.loginFailedInfo", vs.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return vs.a("disconnect.loginFailedInfo", vs.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return vs.a("disconnect.loginFailedInfo", vs.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return vs.a("disconnect.loginFailedInfo", vs.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return vs.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService e() {
      return this.b.al();
   }

   @Override
   public void a(ahc $$0) {
      this.a(fqz.a.d);
      GameProfile $$1 = $$0.b();
      this.f.a(zy.b, new fqy(this.b, this.f, new fre($$1, this.b.t().a(this.g, this.h, this.i), frc.a().a(), ckn.h, null, this.c, this.d, this.j)));
      this.f.a(ahm.a);
      this.f.a(zy.a);
      this.f.a(new ys(new yy(ClientBrandRetriever.getClientModName())));
      this.f.a(new yr(this.b.m.at()));
   }

   @Override
   public void a(vs $$0) {
      vs $$1 = this.k ? vr.q : vr.r;
      if (this.c != null && this.c.e()) {
         this.b.a(new gnx(this.d, $$1, $$0));
      } else {
         this.b.a(new ffj(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(ahf $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(ahe $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahb $$0) {
      this.e.accept(vs.c("connect.negotiating"));
      this.f.a(new ahj($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(aad $$0) {
      this.f.a(new aag($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$0.a("Login phase", () -> this.l.get().toString());
   }

   static enum a {
      a(vs.c("connect.connecting"), Set.of()),
      b(vs.c("connect.authorizing"), Set.of(a)),
      c(vs.c("connect.encrypting"), Set.of(b)),
      d(vs.c("connect.joining"), Set.of(c, a));

      final vs e;
      final Set<fqz.a> f;

      private a(vs $$0, Set<fqz.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
