import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bwq {
   @Nullable
   public static elb a(bme $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static elb a(bme $$0, int $$1, int $$2, ToDoubleFunction<hv> $$3) {
      boolean $$4 = bwo.a($$0, $$1);
      return bwr.a(() -> {
         hv $$4x = bwr.a($$0.eg(), $$1, $$2);
         hv $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static elb a(bme $$0, int $$1, int $$2, elb $$3) {
      elb $$4 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$5 = bwo.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static elb b(bme $$0, int $$1, int $$2, elb $$3) {
      elb $$4 = $$0.dk().d($$3);
      boolean $$5 = bwo.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static elb a(bme $$0, int $$1, int $$2, elb $$3, boolean $$4) {
      return bwr.a($$0, () -> {
         hv $$5 = bwr.a($$0.eg(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            hv $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static hv a(bme $$0, hv $$1) {
      $$1 = bwr.a($$1, $$0.dM().ak(), $$1x -> bwo.c($$0, $$1x));
      return !bwo.a($$0, $$1) && !bwo.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static hv a(bme $$0, int $$1, boolean $$2, hv $$3) {
      hv $$4 = bwr.a($$0, $$1, $$0.eg(), $$3);
      return !bwo.a($$4, $$0) && !bwo.a($$2, $$0, $$4) && !bwo.a($$0.N(), $$4) ? $$4 : null;
   }
}
