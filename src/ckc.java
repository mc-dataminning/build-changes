public class ckc extends cka {
   private static final ckc.a e = new ckc.a();
   private static final float g = 1.0F;

   public ckc(bpc<? extends cka> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public ckc(cis $$0, cwz $$1, double $$2, double $$3, double $$4) {
      super(bpc.bm, $$1, $$0, $$2, $$3, $$4);
   }

   public ckc(cwz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bpc.bm, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void y() {
      this.dM().a(this, null, e, this.dr(), this.dt(), this.dx(), 1.0F + 0.3F * this.ag.i(), false, cwz.a.e, kc.A, kc.z, aty.BK);
   }

   public static final class a extends cka.a {
      @Override
      public float a() {
         return 1.1F;
      }
   }
}
