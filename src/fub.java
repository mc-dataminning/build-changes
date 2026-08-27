public class fub extends fue {
   private final foa a;
   private final fwy b = fwy.i(gbr.a);

   fub(fra $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fnl(eyk.P().aQ().a(fqe.R));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fui b() {
      return fui.e;
   }

   @Override
   public void a(eth $$0, exv $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * awm.a($$3 * (float) Math.PI);
      etd $$5 = new etd();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fwq.a $$6 = eyk.P().aP().c();
      eth $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, ghq.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fuh<ke> {
      public fue a(ke $$0, fra $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fub($$1, $$2, $$3, $$4);
      }
   }
}
