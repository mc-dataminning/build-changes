public class fky extends flb {
   private final ffk a;
   private final fnt b = fnt.i(fsh.a);

   fky(fii $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fev(eqm.O().aP().a(fhm.P));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public flf b() {
      return flf.e;
   }

   @Override
   public void a(elk $$0, epx $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * arp.a($$3 * (float) Math.PI);
      elg $$5 = new elg();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fnl.a $$6 = eqm.O().aO().b();
      elk $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, fyc.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fle<iy> {
      public flb a(iy $$0, fii $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fky($$1, $$2, $$3, $$4);
      }
   }
}
