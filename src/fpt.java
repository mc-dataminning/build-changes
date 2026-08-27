public class fpt extends fpw {
   private final fju a;
   private final fsq b = fsq.i(fxh.a);

   fpt(fmt $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fjf(euk.N().aO().a(flx.S));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fqa b() {
      return fqa.e;
   }

   @Override
   public void a(eph $$0, etv $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * aty.a($$3 * (float) Math.PI);
      epd $$5 = new epd();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fsi.a $$6 = euk.N().aN().c();
      eph $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gdf.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fpz<jy> {
      public fpw a(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fpt($$1, $$2, $$3, $$4);
      }
   }
}
