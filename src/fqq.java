public class fqq extends fqt {
   private final fkr a;
   private final ftn b = ftn.i(fye.a);

   fqq(fnq $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fkc(evg.O().aP().a(fmu.S));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fqx b() {
      return fqx.e;
   }

   @Override
   public void a(eqd $$0, eur $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * aun.a($$3 * (float) Math.PI);
      epz $$5 = new epz();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      ftf.a $$6 = evg.O().aO().c();
      eqd $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gec.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fqw<ka> {
      public fqt a(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fqq($$1, $$2, $$3, $$4);
      }
   }
}
