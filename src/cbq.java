import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cbq {
   @Nullable
   public static esj a(brb $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static esj a(brb $$0, int $$1, int $$2, ToDoubleFunction<id> $$3) {
      boolean $$4 = cbo.a($$0, $$1);
      return cbr.a(() -> {
         id $$4x = cbr.a($$0.ei(), $$1, $$2);
         id $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static esj a(brb $$0, int $$1, int $$2, esj $$3) {
      esj $$4 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$5 = cbo.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static esj b(brb $$0, int $$1, int $$2, esj $$3) {
      esj $$4 = $$0.dk().d($$3);
      boolean $$5 = cbo.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static esj a(brb $$0, int $$1, int $$2, esj $$3, boolean $$4) {
      return cbr.a($$0, () -> {
         id $$5 = cbr.a($$0.ei(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            id $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static id a(brb $$0, id $$1) {
      $$1 = cbr.a($$1, $$0.dM().al(), $$1x -> cbo.c($$0, $$1x));
      return !cbo.a($$0, $$1) && !cbo.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static id a(brb $$0, int $$1, boolean $$2, id $$3) {
      id $$4 = cbr.a($$0, $$1, $$0.ei(), $$3);
      return !cbo.a($$4, $$0) && !cbo.a($$2, $$0, $$4) && !cbo.a($$0.K(), $$4) ? $$4 : null;
   }
}
