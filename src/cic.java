import javax.annotation.Nullable;

public class cic {
   @Nullable
   public static ffc a(bxr $$0, int $$1, int $$2) {
      boolean $$3 = cid.a($$0, $$1);
      return cig.a($$0, () -> {
         iv $$4 = cig.a($$0.dX(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ffc a(bxr $$0, int $$1, int $$2, ffc $$3, double $$4) {
      ffc $$5 = $$3.a($$0.dz(), $$0.dB(), $$0.dF());
      boolean $$6 = cid.a($$0, $$1);
      return cig.a($$0, () -> {
         iv $$6x = cig.a($$0.dX(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ffc a(bxr $$0, int $$1, int $$2, ffc $$3) {
      ffc $$4 = $$0.ds().d($$3);
      boolean $$5 = cid.a($$0, $$1);
      return cig.a($$0, () -> {
         iv $$5x = cig.a($$0.dX(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static iv a(bxr $$0, int $$1, boolean $$2, iv $$3) {
      iv $$4 = cig.a($$0, $$1, $$0.dX(), $$3);
      return !cid.a($$4, $$0) && !cid.a($$2, $$0, $$4) && !cid.a($$0.O(), $$4) && !cid.b($$0, $$4) ? $$4 : null;
   }
}
