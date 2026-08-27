public class fqs extends fqv {
   private final fkt a;
   private final ftp b = ftp.i(fyg.a);

   fqs(fns $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fke(evi.O().aP().a(fmw.S));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fqz b() {
      return fqz.e;
   }

   @Override
   public void a(eqf $$0, eut $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * auo.a($$3 * (float) Math.PI);
      eqb $$5 = new eqb();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fth.a $$6 = evi.O().aO().c();
      eqf $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gee.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fqy<ka> {
      public fqv a(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fqs($$1, $$2, $$3, $$4);
      }
   }
}
