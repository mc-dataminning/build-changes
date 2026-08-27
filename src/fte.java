public class fte extends fth {
   private final fne a;
   private final fwb b = fwb.i(gat.a);

   fte(fqe $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fmp(exo.P().aQ().a(fpi.R));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public ftl b() {
      return ftl.e;
   }

   @Override
   public void a(esl $$0, ewz $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * awi.a($$3 * (float) Math.PI);
      esh $$5 = new esh();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fvt.a $$6 = exo.P().aP().c();
      esl $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, ggs.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements ftk<kc> {
      public fth a(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fte($$1, $$2, $$3, $$4);
      }
   }
}
