public class flj extends fmv<cdm> {
   public flj(fpj $$0) {
      super($$0);
   }

   public static fpp a(fpn $$0) {
      fpr $$1 = fmv.a($$0, 0.0F);
      fps $$2 = $$1.a();
      $$2.a("head", fpo.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fpl.a(0.0F, 1.0F, 0.0F));
      $$2.a("hat", fpo.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0.a(0.5F)), fpl.a(0.0F, 1.0F, 0.0F));
      $$2.a("right_leg", fpo.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(-0.1F)), fpl.a(-1.9F, 11.0F, 0.0F));
      $$2.a("left_leg", fpo.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(-0.1F)), fpl.a(1.9F, 11.0F, 0.0F));
      return fpp.a($$1, 64, 32);
   }

   public void a(cdm $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.k.e = (float) (Math.PI / 180.0) * $$0.C().b();
      this.k.f = (float) (Math.PI / 180.0) * $$0.C().c();
      this.k.g = (float) (Math.PI / 180.0) * $$0.C().d();
      this.m.e = (float) (Math.PI / 180.0) * $$0.D().b();
      this.m.f = (float) (Math.PI / 180.0) * $$0.D().c();
      this.m.g = (float) (Math.PI / 180.0) * $$0.D().d();
      this.o.e = (float) (Math.PI / 180.0) * $$0.E().b();
      this.o.f = (float) (Math.PI / 180.0) * $$0.E().c();
      this.o.g = (float) (Math.PI / 180.0) * $$0.E().d();
      this.n.e = (float) (Math.PI / 180.0) * $$0.G().b();
      this.n.f = (float) (Math.PI / 180.0) * $$0.G().c();
      this.n.g = (float) (Math.PI / 180.0) * $$0.G().d();
      this.q.e = (float) (Math.PI / 180.0) * $$0.H().b();
      this.q.f = (float) (Math.PI / 180.0) * $$0.H().c();
      this.q.g = (float) (Math.PI / 180.0) * $$0.H().d();
      this.p.e = (float) (Math.PI / 180.0) * $$0.I().b();
      this.p.f = (float) (Math.PI / 180.0) * $$0.I().c();
      this.p.g = (float) (Math.PI / 180.0) * $$0.I().d();
      this.l.a(this.k);
   }
}
