public class czs extends czb {
   private static final czs.a[] b = new czs.a[]{new czs.a(0.5F), new czs.a(0.75F), new czs.a(1.0F)};

   public czs() {
      super(czb.a(awf.bS, 2, 3, czb.a(15, 9), czb.a(65, 9), 4, col.a(coo.c), bsd.a));
   }

   @Override
   public void c(bsq $$0, brw $$1, int $$2) {
      $$0.dP().a(null, null, b[$$2 - 1], $$0.du(), $$0.dw(), $$0.dA(), 3.5F, false, daz.a.e, ky.A, ky.z, avi.Cm);
   }

   static final class a extends cng.a {
      private final float a;

      public a(float $$0) {
         this.a = $$0;
      }

      @Override
      public float a() {
         return this.a;
      }
   }
}
