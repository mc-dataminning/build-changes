import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bzb {
   @Nullable
   public static ens a(boo $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static ens a(boo $$0, int $$1, int $$2, ToDoubleFunction<hz> $$3) {
      boolean $$4 = byz.a($$0, $$1);
      return bzc.a(() -> {
         hz $$4x = bzc.a($$0.eh(), $$1, $$2);
         hz $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ens a(boo $$0, int $$1, int $$2, ens $$3) {
      ens $$4 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$5 = byz.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ens b(boo $$0, int $$1, int $$2, ens $$3) {
      ens $$4 = $$0.dk().d($$3);
      boolean $$5 = byz.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ens a(boo $$0, int $$1, int $$2, ens $$3, boolean $$4) {
      return bzc.a($$0, () -> {
         hz $$5 = bzc.a($$0.eh(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            hz $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static hz a(boo $$0, hz $$1) {
      $$1 = bzc.a($$1, $$0.dM().al(), $$1x -> byz.c($$0, $$1x));
      return !byz.a($$0, $$1) && !byz.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static hz a(boo $$0, int $$1, boolean $$2, hz $$3) {
      hz $$4 = bzc.a($$0, $$1, $$0.eh(), $$3);
      return !byz.a($$4, $$0) && !byz.a($$2, $$0, $$4) && !byz.a($$0.N(), $$4) ? $$4 : null;
   }
}
