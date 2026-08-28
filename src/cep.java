import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cep {
   @Nullable
   public static evt a(bua $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::d);
   }

   @Nullable
   public static evt a(bua $$0, int $$1, int $$2, ToDoubleFunction<iz> $$3) {
      boolean $$4 = cen.a($$0, $$1);
      return ceq.a(() -> {
         iz $$4x = ceq.a($$0.el(), $$1, $$2);
         iz $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static evt a(bua $$0, int $$1, int $$2, evt $$3) {
      evt $$4 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$5 = cen.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static evt b(bua $$0, int $$1, int $$2, evt $$3) {
      evt $$4 = $$0.dn().d($$3);
      boolean $$5 = cen.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static evt a(bua $$0, int $$1, int $$2, evt $$3, boolean $$4) {
      return ceq.a($$0, () -> {
         iz $$5 = ceq.a($$0.el(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            iz $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static iz a(bua $$0, iz $$1) {
      $$1 = ceq.a($$1, $$0.dP().am(), $$1x -> cen.c($$0, $$1x));
      return !cen.a($$0, $$1) && !cen.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static iz a(bua $$0, int $$1, boolean $$2, iz $$3) {
      iz $$4 = ceq.a($$0, $$1, $$0.el(), $$3);
      return !cen.a($$4, $$0) && !cen.a($$2, $$0, $$4) && !cen.a($$0.K(), $$4) ? $$4 : null;
   }
}
