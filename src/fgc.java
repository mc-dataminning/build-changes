import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgc {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fgc.a> b;

   public static CompletableFuture<fgc.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fgc.a> $$0) {
      fgc.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fgc.a> b() {
      flt $$0 = flh.Q().X();
      return $$0.g() != flt.a.c ? CompletableFuture.completedFuture(new fgc.a(fgc.b.d)) : CompletableFuture.supplyAsync(() -> {
         fgi $$0x = fgi.a();

         try {
            if ($$0x.g() != fgi.a.a) {
               return new fgc.a(fgc.b.b);
            } else {
               return !$$0x.f() ? new fgc.a(fgc.b.c) : new fgc.a(fgc.b.a);
            }
         } catch (fie var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fgc.a(fgc.b.d) : new fgc.a(var2);
         }
      }, af.h());
   }

   public static record a(fgc.b a, @Nullable fie b) {
      public a(fgc.b $$0) {
         this($$0, null);
      }

      public a(fie $$0) {
         this(fgc.b.e, $$0);
      }

      @Nullable
      public fui a(fui $$0) {
         return (fui)(switch (this.a) {
            case a -> null;
            case b -> new fir($$0);
            case c -> new fjb($$0);
            case d -> new fiw(wo.c("mco.error.invalid.session.title"), wo.c("mco.error.invalid.session.message"), $$0);
            case e -> new fiw(Objects.requireNonNull(this.b), $$0);
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
