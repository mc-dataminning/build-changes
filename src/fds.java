import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fds {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fds.a> b;

   public static CompletableFuture<fds.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fds.a> $$0) {
      fds.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fds.a> b() {
      fjc $$0 = fip.Q().X();
      return $$0.g() != fjc.a.c ? CompletableFuture.completedFuture(new fds.a(fds.b.d)) : CompletableFuture.supplyAsync(() -> {
         fdy $$0x = fdy.a();

         try {
            if ($$0x.g() != fdy.a.a) {
               return new fds.a(fds.b.b);
            } else {
               return !$$0x.f() ? new fds.a(fds.b.c) : new fds.a(fds.b.a);
            }
         } catch (ffj var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fds.a(fds.b.d) : new fds.a(var2);
         }
      }, ad.h());
   }

   public static record a(fds.b a, @Nullable ffj b) {
      public a(fds.b $$0) {
         this($$0, null);
      }

      public a(ffj $$0) {
         this(fds.b.e, $$0);
      }

      @Nullable
      public fqh a(fqh $$0) {
         return (fqh)(switch (this.a) {
            case a -> null;
            case b -> new ffw($$0);
            case c -> new fgg($$0);
            case d -> new fgb(xe.c("mco.error.invalid.session.title"), xe.c("mco.error.invalid.session.message"), $$0);
            case e -> new fgb(Objects.requireNonNull(this.b), $$0);
         });
      }
   }

   public static enum b {
      a,
      b,
      c,
      d,
      e;
   }
}
