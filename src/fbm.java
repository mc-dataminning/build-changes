public class fbm extends gty {
   private final fly a;
   private final fbm.a b;
   private fgs c = fgs.a;

   public fbm(fav $$0, fly $$1) {
      super(fdr.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fbm(wx $$0, fly $$1) {
      super(fdr.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fbm(wx $$0, wx $$1, fly $$2) {
      super(fdr.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fbm.a a(fav $$0) {
      ezk $$1 = $$0.a;
      return a(wx.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fbm.a a(wx $$0) {
      return a(wx.c("mco.errorMessage.generic"), $$0);
   }

   private static fbm.a a(wx $$0, wx $$1) {
      return new fbm.a($$0, $$1);
   }

   @Override
   public void aM_() {
      this.c(ffz.a(ww.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fgs.a(this.p, this.b.b, this.n * 3 / 4);
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
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(wx a, wx b) {
   }
}
