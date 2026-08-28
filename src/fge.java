import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fge {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fge.a> b;

   public static CompletableFuture<fge.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fge.a> $$0) {
      fge.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fge.a> b() {
      flv $$0 = flj.Q().X();
      return $$0.g() != flv.a.c ? CompletableFuture.completedFuture(new fge.a(fge.b.d)) : CompletableFuture.supplyAsync(() -> {
         fgk $$0x = fgk.a();

         try {
            if ($$0x.g() != fgk.a.a) {
               return new fge.a(fge.b.b);
            } else {
               return !$$0x.f() ? new fge.a(fge.b.c) : new fge.a(fge.b.a);
            }
         } catch (fig var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fge.a(fge.b.d) : new fge.a(var2);
         }
      }, af.h());
   }

   public static record a(fge.b a, @Nullable fig b) {
      public a(fge.b $$0) {
         this($$0, null);
      }

      public a(fig $$0) {
         this(fge.b.e, $$0);
      }

      @Nullable
      public ful a(ful $$0) {
         return (ful)(switch (this.a) {
            case a -> null;
            case b -> new fit($$0);
            case c -> new fjd($$0);
            case d -> new fiy(wp.c("mco.error.invalid.session.title"), wp.c("mco.error.invalid.session.message"), $$0);
            case e -> new fiy(Objects.requireNonNull(this.b), $$0);
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
