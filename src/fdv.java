public class fdv extends ffg<bxv> {
   public fdv(fhs $$0) {
      super($$0);
   }

   public static fhy a(fhw $$0) {
      fia $$1 = ffg.a($$0, 0.0F);
      fib $$2 = $$1.a();
      $$2.a("head", fhx.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fhu.a(0.0F, 1.0F, 0.0F));
      $$2.a("hat", fhx.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0.a(0.5F)), fhu.a(0.0F, 1.0F, 0.0F));
      $$2.a("right_leg", fhx.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(-0.1F)), fhu.a(-1.9F, 11.0F, 0.0F));
      $$2.a("left_leg", fhx.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(-0.1F)), fhu.a(1.9F, 11.0F, 0.0F));
      return fhy.a($$1, 64, 32);
   }

   public void a(bxv $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.k.e = (float) (Math.PI / 180.0) * $$0.w().b();
      this.k.f = (float) (Math.PI / 180.0) * $$0.w().c();
      this.k.g = (float) (Math.PI / 180.0) * $$0.w().d();
      this.m.e = (float) (Math.PI / 180.0) * $$0.x().b();
      this.m.f = (float) (Math.PI / 180.0) * $$0.x().c();
      this.m.g = (float) (Math.PI / 180.0) * $$0.x().d();
      this.o.e = (float) (Math.PI / 180.0) * $$0.y().b();
      this.o.f = (float) (Math.PI / 180.0) * $$0.y().c();
      this.o.g = (float) (Math.PI / 180.0) * $$0.y().d();
      this.n.e = (float) (Math.PI / 180.0) * $$0.z().b();
      this.n.f = (float) (Math.PI / 180.0) * $$0.z().c();
      this.n.g = (float) (Math.PI / 180.0) * $$0.z().d();
      this.q.e = (float) (Math.PI / 180.0) * $$0.A().b();
      this.q.f = (float) (Math.PI / 180.0) * $$0.A().c();
      this.q.g = (float) (Math.PI / 180.0) * $$0.A().d();
      this.p.e = (float) (Math.PI / 180.0) * $$0.B().b();
      this.p.f = (float) (Math.PI / 180.0) * $$0.B().c();
      this.p.g = (float) (Math.PI / 180.0) * $$0.B().d();
      this.l.a(this.k);
   }
}
