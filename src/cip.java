import javax.annotation.Nullable;

public class cip {
   @Nullable
   public static ffs a(bye $$0, int $$1, int $$2) {
      boolean $$3 = ciq.a($$0, $$1);
      return cit.a($$0, () -> {
         iw $$4 = cit.a($$0.dY(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ffs a(bye $$0, int $$1, int $$2, ffs $$3, double $$4) {
      ffs $$5 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$6 = ciq.a($$0, $$1);
      return cit.a($$0, () -> {
         iw $$6x = cit.a($$0.dY(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ffs a(bye $$0, int $$1, int $$2, ffs $$3) {
      ffs $$4 = $$0.dt().d($$3);
      boolean $$5 = ciq.a($$0, $$1);
      return cit.a($$0, () -> {
         iw $$5x = cit.a($$0.dY(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static iw a(bye $$0, int $$1, boolean $$2, iw $$3) {
      iw $$4 = cit.a($$0, $$1, $$0.dY(), $$3);
      return !ciq.a($$4, $$0) && !ciq.a($$2, $$0, $$4) && !ciq.a($$0.O(), $$4) && !ciq.b($$0, $$4) ? $$4 : null;
   }
}
