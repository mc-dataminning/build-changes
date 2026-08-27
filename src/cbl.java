import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cbl {
   @Nullable
   public static esa a(bqw $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static esa a(bqw $$0, int $$1, int $$2, ToDoubleFunction<ib> $$3) {
      boolean $$4 = cbj.a($$0, $$1);
      return cbm.a(() -> {
         ib $$4x = cbm.a($$0.ei(), $$1, $$2);
         ib $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static esa a(bqw $$0, int $$1, int $$2, esa $$3) {
      esa $$4 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$5 = cbj.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static esa b(bqw $$0, int $$1, int $$2, esa $$3) {
      esa $$4 = $$0.dk().d($$3);
      boolean $$5 = cbj.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static esa a(bqw $$0, int $$1, int $$2, esa $$3, boolean $$4) {
      return cbm.a($$0, () -> {
         ib $$5 = cbm.a($$0.ei(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ib $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ib a(bqw $$0, ib $$1) {
      $$1 = cbm.a($$1, $$0.dM().al(), $$1x -> cbj.c($$0, $$1x));
      return !cbj.a($$0, $$1) && !cbj.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ib a(bqw $$0, int $$1, boolean $$2, ib $$3) {
      ib $$4 = cbm.a($$0, $$1, $$0.ei(), $$3);
      return !cbj.a($$4, $$0) && !cbj.a($$2, $$0, $$4) && !cbj.a($$0.K(), $$4) ? $$4 : null;
   }
}
