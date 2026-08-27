public class fbo extends gty {
   private final flz a;
   private final fbo.a b;
   private fgt c = fgt.a;

   public fbo(fax $$0, flz $$1) {
      super(fdt.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fbo(wx $$0, flz $$1) {
      super(fdt.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fbo(wx $$0, wx $$1, flz $$2) {
      super(fdt.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fbo.a a(fax $$0) {
      ezm $$1 = $$0.a;
      return a(wx.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fbo.a a(wx $$0) {
      return a(wx.c("mco.errorMessage.generic"), $$0);
   }

   private static fbo.a a(wx $$0, wx $$1) {
      return new fbo.a($$0, $$1);
   }

   @Override
   public void aN_() {
      this.c(fga.a(ww.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fgt.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public wx i() {
      return wx.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(wx a, wx b) {
   }
}
