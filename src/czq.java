public class czq extends cyz {
   private static final czq.a[] b = new czq.a[]{new czq.a(0.5F), new czq.a(0.75F), new czq.a(1.0F)};

   public czq() {
      super(cyz.a(awe.bS, 2, 3, cyz.a(15, 9), cyz.a(65, 9), 4, coj.a(col.c), bsb.a));
   }

   @Override
   public void c(bso $$0, bru $$1, int $$2) {
      $$0.dP().a(null, null, b[$$2 - 1], $$0.du(), $$0.dw(), $$0.dA(), 3.5F, false, dax.a.e, ky.A, ky.z, avh.Cm);
   }

   static final class a extends cne.a {
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
