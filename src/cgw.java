import javax.annotation.Nullable;

public class cgw {
   @Nullable
   public static fbs a(bwj $$0, int $$1, int $$2) {
      boolean $$3 = cgx.a($$0, $$1);
      return cha.a($$0, () -> {
         jh $$4 = cha.a($$0.dY(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static fbs a(bwj $$0, int $$1, int $$2, fbs $$3, double $$4) {
      fbs $$5 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$6 = cgx.a($$0, $$1);
      return cha.a($$0, () -> {
         jh $$6x = cha.a($$0.dY(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static fbs a(bwj $$0, int $$1, int $$2, fbs $$3) {
      fbs $$4 = $$0.dt().d($$3);
      boolean $$5 = cgx.a($$0, $$1);
      return cha.a($$0, () -> {
         jh $$5x = cha.a($$0.dY(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static jh a(bwj $$0, int $$1, boolean $$2, jh $$3) {
      jh $$4 = cha.a($$0, $$1, $$0.dY(), $$3);
      return !cgx.a($$4, $$0) && !cgx.a($$2, $$0, $$4) && !cgx.a($$0.L(), $$4) && !cgx.b($$0, $$4) ? $$4 : null;
   }
}
