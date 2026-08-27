public class fqr extends fqu {
   private final fks a;
   private final fto b = fto.i(fyf.a);

   fqr(fnr $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fkd(evh.O().aP().a(fmv.S));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fqy b() {
      return fqy.e;
   }

   @Override
   public void a(eqe $$0, eus $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * aun.a($$3 * (float) Math.PI);
      eqa $$5 = new eqa();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      ftg.a $$6 = evh.O().aO().c();
      eqe $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, ged.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fqx<ka> {
      public fqu a(ka $$0, fnr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fqr($$1, $$2, $$3, $$4);
      }
   }
}
