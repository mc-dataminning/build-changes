import javax.annotation.Nullable;

public class ciy {
   @Nullable
   public static fgc a(byn $$0, int $$1, int $$2) {
      boolean $$3 = ciz.a($$0, $$1);
      return cjc.a($$0, () -> {
         iw $$4 = cjc.a($$0.dY(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static fgc a(byn $$0, int $$1, int $$2, fgc $$3, double $$4) {
      fgc $$5 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$6 = ciz.a($$0, $$1);
      return cjc.a($$0, () -> {
         iw $$6x = cjc.a($$0.dY(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static fgc a(byn $$0, int $$1, int $$2, fgc $$3) {
      fgc $$4 = $$0.dt().d($$3);
      boolean $$5 = ciz.a($$0, $$1);
      return cjc.a($$0, () -> {
         iw $$5x = cjc.a($$0.dY(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static iw a(byn $$0, int $$1, boolean $$2, iw $$3) {
      iw $$4 = cjc.a($$0, $$1, $$0.dY(), $$3);
      return !ciz.a($$4, $$0) && !ciz.a($$2, $$0, $$4) && !ciz.a($$0.N(), $$4) && !ciz.b($$0, $$4) ? $$4 : null;
   }
}
