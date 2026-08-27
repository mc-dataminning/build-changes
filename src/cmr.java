public class cmr extends cmp {
   private static final cmr.a e = new cmr.a();
   private static final float g = 1.2F;

   public cmr(brn<? extends cmp> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cmr(clh $$0, dad $$1, double $$2, double $$3, double $$4) {
      super(brn.bm, $$1, $$0, $$2, $$3, $$4);
   }

   public cmr(dad $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(brn.bm, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void y() {
      this.dN().a(this, null, e, this.ds(), this.du(), this.dy(), 1.2F, false, dad.a.e, kx.z, kx.y, avc.Cb);
   }

   public static final class a extends cmp.a {
      @Override
      public float a() {
         return 1.1F;
      }
   }
}
