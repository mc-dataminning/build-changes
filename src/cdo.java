import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cdo {
   @Nullable
   public static eum a(bsz $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::d);
   }

   @Nullable
   public static eum a(bsz $$0, int $$1, int $$2, ToDoubleFunction<io> $$3) {
      boolean $$4 = cdm.a($$0, $$1);
      return cdp.a(() -> {
         io $$4x = cdp.a($$0.el(), $$1, $$2);
         io $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static eum a(bsz $$0, int $$1, int $$2, eum $$3) {
      eum $$4 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$5 = cdm.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static eum b(bsz $$0, int $$1, int $$2, eum $$3) {
      eum $$4 = $$0.dn().d($$3);
      boolean $$5 = cdm.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static eum a(bsz $$0, int $$1, int $$2, eum $$3, boolean $$4) {
      return cdp.a($$0, () -> {
         io $$5 = cdp.a($$0.el(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            io $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static io a(bsz $$0, io $$1) {
      $$1 = cdp.a($$1, $$0.dP().al(), $$1x -> cdm.c($$0, $$1x));
      return !cdm.a($$0, $$1) && !cdm.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static io a(bsz $$0, int $$1, boolean $$2, io $$3) {
      io $$4 = cdp.a($$0, $$1, $$0.el(), $$3);
      return !cdm.a($$4, $$0) && !cdm.a($$2, $$0, $$4) && !cdm.a($$0.K(), $$4) ? $$4 : null;
   }
}
