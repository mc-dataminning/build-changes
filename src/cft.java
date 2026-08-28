import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cft {
   @Nullable
   public static ezh a(bvd $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static ezh a(bvd $$0, int $$1, int $$2, ToDoubleFunction<jg> $$3) {
      boolean $$4 = cfr.a($$0, $$1);
      return cfu.a(() -> {
         jg $$4x = cfu.a($$0.ea(), $$1, $$2);
         jg $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ezh a(bvd $$0, int $$1, int $$2, ezh $$3) {
      ezh $$4 = $$3.a($$0.dC(), $$0.dE(), $$0.dI());
      boolean $$5 = cfr.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ezh b(bvd $$0, int $$1, int $$2, ezh $$3) {
      ezh $$4 = $$0.dv().d($$3);
      boolean $$5 = cfr.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ezh a(bvd $$0, int $$1, int $$2, ezh $$3, boolean $$4) {
      return cfu.a($$0, () -> {
         jg $$5 = cfu.a($$0.ea(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            jg $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static jg a(bvd $$0, jg $$1) {
      $$1 = cfu.a($$1, $$0.dX().an(), $$1x -> cfr.c($$0, $$1x));
      return !cfr.a($$0, $$1) && !cfr.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static jg a(bvd $$0, int $$1, boolean $$2, jg $$3) {
      jg $$4 = cfu.a($$0, $$1, $$0.ea(), $$3);
      return !cfr.a($$4, $$0) && !cfr.a($$2, $$0, $$4) && !cfr.a($$0.P(), $$4) ? $$4 : null;
   }
}
