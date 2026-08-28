import javax.annotation.Nullable;

public class chv {
   @Nullable
   public static fei a(bxk $$0, int $$1, int $$2) {
      boolean $$3 = chw.a($$0, $$1);
      return chz.a($$0, () -> {
         iu $$4 = chz.a($$0.dY(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static fei a(bxk $$0, int $$1, int $$2, fei $$3, double $$4) {
      fei $$5 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$6 = chw.a($$0, $$1);
      return chz.a($$0, () -> {
         iu $$6x = chz.a($$0.dY(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static fei a(bxk $$0, int $$1, int $$2, fei $$3) {
      fei $$4 = $$0.dt().d($$3);
      boolean $$5 = chw.a($$0, $$1);
      return chz.a($$0, () -> {
         iu $$5x = chz.a($$0.dY(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static iu a(bxk $$0, int $$1, boolean $$2, iu $$3) {
      iu $$4 = chz.a($$0, $$1, $$0.dY(), $$3);
      return !chw.a($$4, $$0) && !chw.a($$2, $$0, $$4) && !chw.a($$0.O(), $$4) && !chw.b($$0, $$4) ? $$4 : null;
   }
}
