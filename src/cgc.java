import javax.annotation.Nullable;

public class cgc {
   @Nullable
   public static ezy a(bvp $$0, int $$1, int $$2) {
      boolean $$3 = cgd.a($$0, $$1);
      return cgg.a($$0, () -> {
         jh $$4 = cgg.a($$0.dY(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ezy a(bvp $$0, int $$1, int $$2, ezy $$3, double $$4) {
      ezy $$5 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$6 = cgd.a($$0, $$1);
      return cgg.a($$0, () -> {
         jh $$6x = cgg.a($$0.dY(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ezy a(bvp $$0, int $$1, int $$2, ezy $$3) {
      ezy $$4 = $$0.dt().d($$3);
      boolean $$5 = cgd.a($$0, $$1);
      return cgg.a($$0, () -> {
         jh $$5x = cgg.a($$0.dY(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static jh a(bvp $$0, int $$1, boolean $$2, jh $$3) {
      jh $$4 = cgg.a($$0, $$1, $$0.dY(), $$3);
      return !cgd.a($$4, $$0) && !cgd.a($$2, $$0, $$4) && !cgd.a($$0.L(), $$4) && !cgd.b($$0, $$4) ? $$4 : null;
   }
}
