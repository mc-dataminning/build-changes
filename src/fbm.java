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
      fgv $$0 = fgi.Q().X();
      return $$0.g() != fgv.a.c ? CompletableFuture.completedFuture(new fbm.a(fbm.b.d)) : CompletableFuture.supplyAsync(() -> {
         fbs $$0x = fbs.a();

         try {
            if ($$0x.g() != fbs.a.a) {
               return new fbm.a(fbm.b.b);
            } else {
               return !$$0x.f() ? new fbm.a(fbm.b.c) : new fbm.a(fbm.b.a);
            }
         } catch (fdd var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fbm.a(fbm.b.d) : new fbm.a(var2);
         }
      }, ad.h());
   }

   public static record a(fbm.b a, @Nullable fdd b) {
      public a(fbm.b $$0) {
         this($$0, null);
      }

      public a(fdd $$0) {
         this(fbm.b.e, $$0);
      }

      @Nullable
      public fnx a(fnx $$0) {
         return (fnx)(switch (this.a) {
            case a -> null;
            case b -> new fdq($$0);
            case c -> new fea($$0);
            case d -> new fdv(wy.c("mco.error.invalid.session.title"), wy.c("mco.error.invalid.session.message"), $$0);
            case e -> new fdv(Objects.requireNonNull(this.b), $$0);
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
