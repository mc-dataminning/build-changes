public class flm extends flp {
   private final ffu a;
   private final foh b = foh.i(fsv.a);

   flm(fis $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fff(eqq.O().aP().a(fhw.P));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public flt b() {
      return flt.e;
   }

   @Override
   public void a(elo $$0, eqb $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * ars.a($$3 * (float) Math.PI);
      elk $$5 = new elk();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fnz.a $$6 = eqq.O().aO().b();
      elo $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, fyq.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fls<ja> {
      public flp a(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new flm($$1, $$2, $$3, $$4);
      }
   }
}
