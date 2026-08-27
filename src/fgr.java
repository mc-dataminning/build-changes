public class fgr extends fic<cad> {
   public fgr(fko $$0) {
      super($$0);
   }

   public static fku a(fks $$0) {
      fkw $$1 = fic.a($$0, 0.0F);
      fkx $$2 = $$1.a();
      $$2.a("head", fkt.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fkq.a(0.0F, 1.0F, 0.0F));
      $$2.a("hat", fkt.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0.a(0.5F)), fkq.a(0.0F, 1.0F, 0.0F));
      $$2.a("right_leg", fkt.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(-0.1F)), fkq.a(-1.9F, 11.0F, 0.0F));
      $$2.a("left_leg", fkt.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(-0.1F)), fkq.a(1.9F, 11.0F, 0.0F));
      return fku.a($$1, 64, 32);
   }

   public void a(cad $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.k.e = (float) (Math.PI / 180.0) * $$0.B().b();
      this.k.f = (float) (Math.PI / 180.0) * $$0.B().c();
      this.k.g = (float) (Math.PI / 180.0) * $$0.B().d();
      this.m.e = (float) (Math.PI / 180.0) * $$0.C().b();
      this.m.f = (float) (Math.PI / 180.0) * $$0.C().c();
      this.m.g = (float) (Math.PI / 180.0) * $$0.C().d();
      this.o.e = (float) (Math.PI / 180.0) * $$0.D().b();
      this.o.f = (float) (Math.PI / 180.0) * $$0.D().c();
      this.o.g = (float) (Math.PI / 180.0) * $$0.D().d();
      this.n.e = (float) (Math.PI / 180.0) * $$0.E().b();
      this.n.f = (float) (Math.PI / 180.0) * $$0.E().c();
      this.n.g = (float) (Math.PI / 180.0) * $$0.E().d();
      this.q.e = (float) (Math.PI / 180.0) * $$0.G().b();
      this.q.f = (float) (Math.PI / 180.0) * $$0.G().c();
      this.q.g = (float) (Math.PI / 180.0) * $$0.G().d();
      this.p.e = (float) (Math.PI / 180.0) * $$0.H().b();
      this.p.f = (float) (Math.PI / 180.0) * $$0.H().c();
      this.p.g = (float) (Math.PI / 180.0) * $$0.H().d();
      this.l.a(this.k);
   }
}
