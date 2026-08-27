public class fez extends fgk<bzg> {
   public fez(fiw $$0) {
      super($$0);
   }

   public static fjc a(fja $$0) {
      fje $$1 = fgk.a($$0, 0.0F);
      fjf $$2 = $$1.a();
      $$2.a("head", fjb.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fiy.a(0.0F, 1.0F, 0.0F));
      $$2.a("hat", fjb.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0.a(0.5F)), fiy.a(0.0F, 1.0F, 0.0F));
      $$2.a("right_leg", fjb.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(-0.1F)), fiy.a(-1.9F, 11.0F, 0.0F));
      $$2.a("left_leg", fjb.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(-0.1F)), fiy.a(1.9F, 11.0F, 0.0F));
      return fjc.a($$1, 64, 32);
   }

   public void a(bzg $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.k.e = (float) (Math.PI / 180.0) * $$0.z().b();
      this.k.f = (float) (Math.PI / 180.0) * $$0.z().c();
      this.k.g = (float) (Math.PI / 180.0) * $$0.z().d();
      this.m.e = (float) (Math.PI / 180.0) * $$0.A().b();
      this.m.f = (float) (Math.PI / 180.0) * $$0.A().c();
      this.m.g = (float) (Math.PI / 180.0) * $$0.A().d();
      this.o.e = (float) (Math.PI / 180.0) * $$0.B().b();
      this.o.f = (float) (Math.PI / 180.0) * $$0.B().c();
      this.o.g = (float) (Math.PI / 180.0) * $$0.B().d();
      this.n.e = (float) (Math.PI / 180.0) * $$0.C().b();
      this.n.f = (float) (Math.PI / 180.0) * $$0.C().c();
      this.n.g = (float) (Math.PI / 180.0) * $$0.C().d();
      this.q.e = (float) (Math.PI / 180.0) * $$0.E().b();
      this.q.f = (float) (Math.PI / 180.0) * $$0.E().c();
      this.q.g = (float) (Math.PI / 180.0) * $$0.E().d();
      this.p.e = (float) (Math.PI / 180.0) * $$0.F().b();
      this.p.f = (float) (Math.PI / 180.0) * $$0.F().c();
      this.p.g = (float) (Math.PI / 180.0) * $$0.F().d();
      this.l.a(this.k);
   }
}
