import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bxf {
   @Nullable
   public static els a(bmt $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static els a(bmt $$0, int $$1, int $$2, ToDoubleFunction<hx> $$3) {
      boolean $$4 = bxd.a($$0, $$1);
      return bxg.a(() -> {
         hx $$4x = bxg.a($$0.eg(), $$1, $$2);
         hx $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static els a(bmt $$0, int $$1, int $$2, els $$3) {
      els $$4 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$5 = bxd.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static els b(bmt $$0, int $$1, int $$2, els $$3) {
      els $$4 = $$0.dk().d($$3);
      boolean $$5 = bxd.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static els a(bmt $$0, int $$1, int $$2, els $$3, boolean $$4) {
      return bxg.a($$0, () -> {
         hx $$5 = bxg.a($$0.eg(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            hx $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static hx a(bmt $$0, hx $$1) {
      $$1 = bxg.a($$1, $$0.dM().al(), $$1x -> bxd.c($$0, $$1x));
      return !bxd.a($$0, $$1) && !bxd.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static hx a(bmt $$0, int $$1, boolean $$2, hx $$3) {
      hx $$4 = bxg.a($$0, $$1, $$0.eg(), $$3);
      return !bxd.a($$4, $$0) && !bxd.a($$2, $$0, $$4) && !bxd.a($$0.N(), $$4) ? $$4 : null;
   }
}
