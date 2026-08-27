public class fof extends foi {
   private final fil a;
   private final frc b = frc.i(fvq.a);

   fof(flj $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fhw(etd.N().aO().a(fkn.P));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fom b() {
      return fom.e;
   }

   @Override
   public void a(eoa $$0, eso $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * atm.a($$3 * (float) Math.PI);
      enw $$5 = new enw();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fqu.a $$6 = etd.N().aN().c();
      eoa $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gbl.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fol<jv> {
      public foi a(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fof($$1, $$2, $$3, $$4);
      }
   }
}
