public class fmn extends fmq {
   private final fgt a;
   private final fpj b = fpj.i(ftw.a);

   fmn(fjr $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fge(ero.O().aP().a(fiv.P));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fmu b() {
      return fmu.e;
   }

   @Override
   public void a(eml $$0, eqz $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * asy.a($$3 * (float) Math.PI);
      emh $$5 = new emh();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fpb.a $$6 = ero.O().aO().b();
      eml $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, fzr.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fmt<jv> {
      public fmq a(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fmn($$1, $$2, $$3, $$4);
      }
   }
}
