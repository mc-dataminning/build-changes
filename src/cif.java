import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cif {
   @Nullable
   public static ffc a(bxr $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static ffc a(bxr $$0, int $$1, int $$2, ToDoubleFunction<iv> $$3) {
      boolean $$4 = cid.a($$0, $$1);
      return cig.a(() -> {
         iv $$4x = cig.a($$0.dX(), $$1, $$2);
         iv $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ffc a(bxr $$0, int $$1, int $$2, ffc $$3) {
      ffc $$4 = $$3.a($$0.dz(), $$0.dB(), $$0.dF());
      boolean $$5 = cid.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ffc b(bxr $$0, int $$1, int $$2, ffc $$3) {
      ffc $$4 = $$0.ds().d($$3);
      boolean $$5 = cid.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ffc a(bxr $$0, int $$1, int $$2, ffc $$3, boolean $$4) {
      return cig.a($$0, () -> {
         iv $$5 = cig.a($$0.dX(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            iv $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static iv a(bxr $$0, iv $$1) {
      $$1 = cig.a($$1, $$0.dU().ao(), $$1x -> cid.c($$0, $$1x));
      return !cid.a($$0, $$1) && !cid.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static iv a(bxr $$0, int $$1, boolean $$2, iv $$3) {
      iv $$4 = cig.a($$0, $$1, $$0.dX(), $$3);
      return !cid.a($$4, $$0) && !cid.a($$2, $$0, $$4) && !cid.a($$0.O(), $$4) ? $$4 : null;
   }
}
