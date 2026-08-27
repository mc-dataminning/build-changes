import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bqt {
   @Nullable
   public static eei a(bgi $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static eei a(bgi $$0, int $$1, int $$2, ToDoubleFunction<gu> $$3) {
      boolean $$4 = bqr.a($$0, $$1);
      return bqu.a(() -> {
         gu $$4x = bqu.a($$0.ec(), $$1, $$2);
         gu $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static eei a(bgi $$0, int $$1, int $$2, eei $$3) {
      eei $$4 = $$3.a($$0.dn(), $$0.dp(), $$0.dt());
      boolean $$5 = bqr.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static eei b(bgi $$0, int $$1, int $$2, eei $$3) {
      eei $$4 = $$0.dg().d($$3);
      boolean $$5 = bqr.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static eei a(bgi $$0, int $$1, int $$2, eei $$3, boolean $$4) {
      return bqu.a($$0, () -> {
         gu $$5 = bqu.a($$0.ec(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            gu $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static gu a(bgi $$0, gu $$1) {
      $$1 = bqu.a($$1, $$0.dI().aj(), $$1x -> bqr.c($$0, $$1x));
      return !bqr.a($$0, $$1) && !bqr.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static gu a(bgi $$0, int $$1, boolean $$2, gu $$3) {
      gu $$4 = bqu.a($$0, $$1, $$0.ec(), $$3);
      return !bqr.a($$4, $$0) && !bqr.a($$2, $$0, $$4) && !bqr.a($$0.J(), $$4) ? $$4 : null;
   }
}
