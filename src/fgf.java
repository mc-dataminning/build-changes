import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgf {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fgf.a> b;

   public static CompletableFuture<fgf.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fgf.a> $$0) {
      fgf.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fgf.a> b() {
      flw $$0 = flk.Q().X();
      return $$0.g() != flw.a.c ? CompletableFuture.completedFuture(new fgf.a(fgf.b.d)) : CompletableFuture.supplyAsync(() -> {
         fgl $$0x = fgl.a();

         try {
            if ($$0x.g() != fgl.a.a) {
               return new fgf.a(fgf.b.b);
            } else {
               return !$$0x.f() ? new fgf.a(fgf.b.c) : new fgf.a(fgf.b.a);
            }
         } catch (fih var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fgf.a(fgf.b.d) : new fgf.a(var2);
         }
      }, af.i());
   }

   public static record a(fgf.b a, @Nullable fih b) {
      public a(fgf.b $$0) {
         this($$0, null);
      }

      public a(fih $$0) {
         this(fgf.b.e, $$0);
      }

      @Nullable
      public fum a(fum $$0) {
         return (fum)(switch (this.a) {
            case a -> null;
            case b -> new fiu($$0);
            case c -> new fje($$0);
            case d -> new fiz(wp.c("mco.error.invalid.session.title"), wp.c("mco.error.invalid.session.message"), $$0);
            case e -> new fiz(Objects.requireNonNull(this.b), $$0);
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
