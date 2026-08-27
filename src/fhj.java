public class fhj extends fhm {
   private final fcb a;
   private final fkf b = fkf.h(foq.a);

   fhj(few $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fbm(enn.N().aO().a(fed.P));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fhq b() {
      return fhq.e;
   }

   @Override
   public void a(ein $$0, emz $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * apa.a($$3 * (float) Math.PI);
      eij $$5 = new eij();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fjx.a $$6 = enn.N().aN().b();
      ein $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, fum.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fhp<iy> {
      public fhm a(iy $$0, few $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fhj($$1, $$2, $$3, $$4);
      }
   }
}
