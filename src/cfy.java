import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cfy {
   @Nullable
   public static ezn a(bvi $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static ezn a(bvi $$0, int $$1, int $$2, ToDoubleFunction<jh> $$3) {
      boolean $$4 = cfw.a($$0, $$1);
      return cfz.a(() -> {
         jh $$4x = cfz.a($$0.ea(), $$1, $$2);
         jh $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ezn a(bvi $$0, int $$1, int $$2, ezn $$3) {
      ezn $$4 = $$3.a($$0.dC(), $$0.dE(), $$0.dI());
      boolean $$5 = cfw.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ezn b(bvi $$0, int $$1, int $$2, ezn $$3) {
      ezn $$4 = $$0.dv().d($$3);
      boolean $$5 = cfw.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ezn a(bvi $$0, int $$1, int $$2, ezn $$3, boolean $$4) {
      return cfz.a($$0, () -> {
         jh $$5 = cfz.a($$0.ea(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            jh $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static jh a(bvi $$0, jh $$1) {
      $$1 = cfz.a($$1, $$0.dX().al(), $$1x -> cfw.c($$0, $$1x));
      return !cfw.a($$0, $$1) && !cfw.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static jh a(bvi $$0, int $$1, boolean $$2, jh $$3) {
      jh $$4 = cfz.a($$0, $$1, $$0.ea(), $$3);
      return !cfw.a($$4, $$0) && !cfw.a($$2, $$0, $$4) && !cfw.a($$0.P(), $$4) ? $$4 : null;
   }
}
