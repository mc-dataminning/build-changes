public class frw extends ftj<chw> {
   public frw(fvw $$0) {
      super($$0);
   }

   public static fwc a(fwa $$0) {
      fwe $$1 = ftj.a($$0, 0.0F);
      fwf $$2 = $$1.a();
      $$2.a("head", fwb.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fvy.a(0.0F, 1.0F, 0.0F));
      $$2.a("hat", fwb.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0.a(0.5F)), fvy.a(0.0F, 1.0F, 0.0F));
      $$2.a("right_leg", fwb.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(-0.1F)), fvy.a(-1.9F, 11.0F, 0.0F));
      $$2.a("left_leg", fwb.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(-0.1F)), fvy.a(1.9F, 11.0F, 0.0F));
      return fwc.a($$1, 64, 32);
   }

   public void a(chw $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.k.e = (float) (Math.PI / 180.0) * $$0.A().b();
      this.k.f = (float) (Math.PI / 180.0) * $$0.A().c();
      this.k.g = (float) (Math.PI / 180.0) * $$0.A().d();
      this.m.e = (float) (Math.PI / 180.0) * $$0.B().b();
      this.m.f = (float) (Math.PI / 180.0) * $$0.B().c();
      this.m.g = (float) (Math.PI / 180.0) * $$0.B().d();
      this.o.e = (float) (Math.PI / 180.0) * $$0.C().b();
      this.o.f = (float) (Math.PI / 180.0) * $$0.C().c();
      this.o.g = (float) (Math.PI / 180.0) * $$0.C().d();
      this.n.e = (float) (Math.PI / 180.0) * $$0.D().b();
      this.n.f = (float) (Math.PI / 180.0) * $$0.D().c();
      this.n.g = (float) (Math.PI / 180.0) * $$0.D().d();
      this.q.e = (float) (Math.PI / 180.0) * $$0.E().b();
      this.q.f = (float) (Math.PI / 180.0) * $$0.E().c();
      this.q.g = (float) (Math.PI / 180.0) * $$0.E().d();
      this.p.e = (float) (Math.PI / 180.0) * $$0.G().b();
      this.p.f = (float) (Math.PI / 180.0) * $$0.G().c();
      this.p.g = (float) (Math.PI / 180.0) * $$0.G().d();
      this.l.a(this.k);
   }
}
