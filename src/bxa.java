import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bxa {
   @Nullable
   public static elm a(bmo $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static elm a(bmo $$0, int $$1, int $$2, ToDoubleFunction<hx> $$3) {
      boolean $$4 = bwy.a($$0, $$1);
      return bxb.a(() -> {
         hx $$4x = bxb.a($$0.eg(), $$1, $$2);
         hx $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static elm a(bmo $$0, int $$1, int $$2, elm $$3) {
      elm $$4 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$5 = bwy.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static elm b(bmo $$0, int $$1, int $$2, elm $$3) {
      elm $$4 = $$0.dk().d($$3);
      boolean $$5 = bwy.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static elm a(bmo $$0, int $$1, int $$2, elm $$3, boolean $$4) {
      return bxb.a($$0, () -> {
         hx $$5 = bxb.a($$0.eg(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            hx $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static hx a(bmo $$0, hx $$1) {
      $$1 = bxb.a($$1, $$0.dM().al(), $$1x -> bwy.c($$0, $$1x));
      return !bwy.a($$0, $$1) && !bwy.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static hx a(bmo $$0, int $$1, boolean $$2, hx $$3) {
      hx $$4 = bxb.a($$0, $$1, $$0.eg(), $$3);
      return !bwy.a($$4, $$0) && !bwy.a($$2, $$0, $$4) && !bwy.a($$0.N(), $$4) ? $$4 : null;
   }
}
