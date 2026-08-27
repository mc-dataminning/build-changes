public class fln extends flq {
   private final ffu a;
   private final foi b = foi.i(fsw.a);

   fln(fis $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fff(eqp.O().aP().a(fhw.P));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public flu b() {
      return flu.e;
   }

   @Override
   public void a(eln $$0, eqa $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * asb.a($$3 * (float) Math.PI);
      elj $$5 = new elj();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      foa.a $$6 = eqp.O().aO().b();
      eln $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, fyr.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements flt<iy> {
      public flq a(iy $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fln($$1, $$2, $$3, $$4);
      }
   }
}
