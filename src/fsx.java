public class fsx extends fta {
   private final fmx a;
   private final fvu b = fvu.i(gam.a);

   fsx(fpx $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fmi(exh.O().aP().a(fpb.R));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fte b() {
      return fte.e;
   }

   @Override
   public void a(ese $$0, ews $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * awh.a($$3 * (float) Math.PI);
      esa $$5 = new esa();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fvm.a $$6 = exh.O().aO().c();
      ese $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, ggl.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements ftd<kc> {
      public fta a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fsx($$1, $$2, $$3, $$4);
      }
   }
}
