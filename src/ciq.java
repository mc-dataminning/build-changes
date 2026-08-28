import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class ciq {
   @Nullable
   public static ffq a(byc $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static ffq a(byc $$0, int $$1, int $$2, ToDoubleFunction<iv> $$3) {
      boolean $$4 = cio.a($$0, $$1);
      return cir.a(() -> {
         iv $$4x = cir.a($$0.dY(), $$1, $$2);
         iv $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ffq a(byc $$0, int $$1, int $$2, ffq $$3) {
      ffq $$4 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$5 = cio.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ffq b(byc $$0, int $$1, int $$2, ffq $$3) {
      ffq $$4 = $$0.dt().d($$3);
      boolean $$5 = cio.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ffq a(byc $$0, int $$1, int $$2, ffq $$3, boolean $$4) {
      return cir.a($$0, () -> {
         iv $$5 = cir.a($$0.dY(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            iv $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static iv a(byc $$0, iv $$1) {
      $$1 = cir.a($$1, $$0.dV().ao(), $$1x -> cio.c($$0, $$1x));
      return !cio.a($$0, $$1) && !cio.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static iv a(byc $$0, int $$1, boolean $$2, iv $$3) {
      iv $$4 = cir.a($$0, $$1, $$0.dY(), $$3);
      return !cio.a($$4, $$0) && !cio.a($$2, $$0, $$4) && !cio.a($$0.O(), $$4) ? $$4 : null;
   }
}
