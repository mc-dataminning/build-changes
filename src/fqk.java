public class fqk extends fqn {
   private final fkl a;
   private final fth b = fth.i(fxy.a);

   fqk(fnk $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fjw(eva.N().aO().a(fmo.S));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public fqr b() {
      return fqr.e;
   }

   @Override
   public void a(epx $$0, eul $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * aui.a($$3 * (float) Math.PI);
      ept $$5 = new ept();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      fsz.a $$6 = eva.N().aN().c();
      epx $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, gdw.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements fqq<ka> {
      public fqn a(ka $$0, fnk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fqk($$1, $$2, $$3, $$4);
      }
   }
}
