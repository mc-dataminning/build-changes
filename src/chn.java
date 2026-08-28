import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class chn {
   @Nullable
   public static fcu a(bwz $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static fcu a(bwz $$0, int $$1, int $$2, ToDoubleFunction<jj> $$3) {
      boolean $$4 = chl.a($$0, $$1);
      return cho.a(() -> {
         jj $$4x = cho.a($$0.dY(), $$1, $$2);
         jj $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static fcu a(bwz $$0, int $$1, int $$2, fcu $$3) {
      fcu $$4 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$5 = chl.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static fcu b(bwz $$0, int $$1, int $$2, fcu $$3) {
      fcu $$4 = $$0.dt().d($$3);
      boolean $$5 = chl.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static fcu a(bwz $$0, int $$1, int $$2, fcu $$3, boolean $$4) {
      return cho.a($$0, () -> {
         jj $$5 = cho.a($$0.dY(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            jj $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static jj a(bwz $$0, jj $$1) {
      $$1 = cho.a($$1, $$0.dV().ao(), $$1x -> chl.c($$0, $$1x));
      return !chl.a($$0, $$1) && !chl.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static jj a(bwz $$0, int $$1, boolean $$2, jj $$3) {
      jj $$4 = cho.a($$0, $$1, $$0.dY(), $$3);
      return !chl.a($$4, $$0) && !chl.a($$2, $$0, $$4) && !chl.a($$0.O(), $$4) ? $$4 : null;
   }
}
