import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cis {
   @Nullable
   public static ffs a(bye $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static ffs a(bye $$0, int $$1, int $$2, ToDoubleFunction<iw> $$3) {
      boolean $$4 = ciq.a($$0, $$1);
      return cit.a(() -> {
         iw $$4x = cit.a($$0.dY(), $$1, $$2);
         iw $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ffs a(bye $$0, int $$1, int $$2, ffs $$3) {
      ffs $$4 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$5 = ciq.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ffs b(bye $$0, int $$1, int $$2, ffs $$3) {
      ffs $$4 = $$0.dt().d($$3);
      boolean $$5 = ciq.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ffs a(bye $$0, int $$1, int $$2, ffs $$3, boolean $$4) {
      return cit.a($$0, () -> {
         iw $$5 = cit.a($$0.dY(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            iw $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static iw a(bye $$0, iw $$1) {
      $$1 = cit.a($$1, $$0.dV().ao(), $$1x -> ciq.c($$0, $$1x));
      return !ciq.a($$0, $$1) && !ciq.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static iw a(bye $$0, int $$1, boolean $$2, iw $$3) {
      iw $$4 = cit.a($$0, $$1, $$0.dY(), $$3);
      return !ciq.a($$4, $$0) && !ciq.a($$2, $$0, $$4) && !ciq.a($$0.O(), $$4) ? $$4 : null;
   }
}
