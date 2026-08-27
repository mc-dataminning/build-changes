import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbm {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fbm.a> b;

   public static CompletableFuture<fbm.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fbm.a> $$0) {
      fbm.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fbm.a> b() {
      return CompletableFuture.supplyAsync(() -> {
         fbs $$0 = fbs.a();

         try {
            if ($$0.g() != fbs.a.a) {
               return new fbm.a(fbm.b.b);
            } else {
               return !$$0.f() ? new fbm.a(fbm.b.c) : new fbm.a(fbm.b.a);
            }
         } catch (fdf var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fbm.a(fbm.b.d) : new fbm.a(var2);
         }
      }, ad.g());
   }

   public static record a(fbm.b a, @Nullable fdf b) {
      public a(fbm.b $$0) {
         this($$0, null);
      }

      public a(fdf $$0) {
         this(fbm.b.e, $$0);
      }

      @Nullable
      public fon a(fon $$0) {
         return (fon)(switch (this.a) {
            case a -> null;
            case b -> new fdr($$0);
            case c -> new fec($$0);
            case d -> new fdw(xe.c("mco.error.invalid.session.title"), xe.c("mco.error.invalid.session.message"), $$0);
            case e -> new fdw(Objects.requireNonNull(this.b), $$0);
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
