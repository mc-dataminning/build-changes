public class fkt extends fkw {
   private final ffg a;
   private final fno b = fno.h(fsc.a);

   fkt(fie $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fer(eqn.N().aO().a(fhi.P));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fla b() {
      return fla.e;
   }

   @Override
   public void a(ell $$0, epy $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * aro.a($$3 * (float) Math.PI);
      elh $$5 = new elh();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fng.a $$6 = eqn.N().aN().b();
      ell $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, fxx.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fkz<iz> {
      public fkw a(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fkt($$1, $$2, $$3, $$4);
      }
   }
}
