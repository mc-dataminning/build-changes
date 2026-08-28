import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdo {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fdo.a> b;

   public static CompletableFuture<fdo.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fdo.a> $$0) {
      fdo.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fdo.a> b() {
      fiy $$0 = fil.Q().X();
      return $$0.g() != fiy.a.c ? CompletableFuture.completedFuture(new fdo.a(fdo.b.d)) : CompletableFuture.supplyAsync(() -> {
         fdu $$0x = fdu.a();

         try {
            if ($$0x.g() != fdu.a.a) {
               return new fdo.a(fdo.b.b);
            } else {
               return !$$0x.f() ? new fdo.a(fdo.b.c) : new fdo.a(fdo.b.a);
            }
         } catch (fff var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fdo.a(fdo.b.d) : new fdo.a(var2);
         }
      }, ad.h());
   }

   public static record a(fdo.b a, @Nullable fff b) {
      public a(fdo.b $$0) {
         this($$0, null);
      }

      public a(fff $$0) {
         this(fdo.b.e, $$0);
      }

      @Nullable
      public fqd a(fqd $$0) {
         return (fqd)(switch (this.a) {
            case a -> null;
            case b -> new ffs($$0);
            case c -> new fgc($$0);
            case d -> new ffx(xd.c("mco.error.invalid.session.title"), xd.c("mco.error.invalid.session.message"), $$0);
            case e -> new ffx(Objects.requireNonNull(this.b), $$0);
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
