import javax.annotation.Nullable;

public class chx {
   @Nullable
   public static feq a(bxm $$0, int $$1, int $$2) {
      boolean $$3 = chy.a($$0, $$1);
      return cib.a($$0, () -> {
         iu $$4 = cib.a($$0.dY(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static feq a(bxm $$0, int $$1, int $$2, feq $$3, double $$4) {
      feq $$5 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$6 = chy.a($$0, $$1);
      return cib.a($$0, () -> {
         iu $$6x = cib.a($$0.dY(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static feq a(bxm $$0, int $$1, int $$2, feq $$3) {
      feq $$4 = $$0.dt().d($$3);
      boolean $$5 = chy.a($$0, $$1);
      return cib.a($$0, () -> {
         iu $$5x = cib.a($$0.dY(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static iu a(bxm $$0, int $$1, boolean $$2, iu $$3) {
      iu $$4 = cib.a($$0, $$1, $$0.dY(), $$3);
      return !chy.a($$4, $$0) && !chy.a($$2, $$0, $$4) && !chy.a($$0.O(), $$4) && !chy.b($$0, $$4) ? $$4 : null;
   }
}
