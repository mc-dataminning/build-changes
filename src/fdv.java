public class fdv extends gwj {
   private final fnx a;
   private final fdv.a b;
   private fiz c = fiz.a;

   public fdv(fdd $$0, fnx $$1) {
      super(fga.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fdv(wy $$0, fnx $$1) {
      super(fga.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fdv(wy $$0, wy $$1, fnx $$2) {
      super(fga.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fdv.a a(fdd $$0) {
      fbu $$1 = $$0.a;
      return a(wy.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fdv.a a(wy $$0) {
      return a(wy.c("mco.errorMessage.generic"), $$0);
   }

   private static fdv.a a(wy $$0, wy $$1) {
      return new fdv.a($$0, $$1);
   }

   @Override
   public void aP_() {
      this.c(fig.a(wx.h, $$0 -> this.d()).a(this.m / 2 - 100, this.n - 52, 200, 20).a());
      this.c = fiz.a(this.o, this.b.b, this.m * 3 / 4);
   }

   @Override
   public void d() {
      this.l.a(this.a);
   }

   @Override
   public wy i() {
      return wy.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.b.a, this.m / 2, 80, -1);
      this.c.a($$0, this.m / 2, 100, 9, -2142128);
   }

   static record a(wy a, wy b) {
   }
}
