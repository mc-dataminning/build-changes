public class fnh extends hqd {
   private final fys a;
   private final fnh.a b;
   private ftt c = ftt.a;

   public fnh(fmp $$0, fys $$1) {
      super(fpk.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fnh(wy $$0, fys $$1) {
      super(fpk.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fnh(wy $$0, wy $$1, fys $$2) {
      super(fpk.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fnh.a a(fmp $$0) {
      fkv $$1 = $$0.a;
      return a(wy.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fnh.a a(wy $$0) {
      return a(wy.c("mco.errorMessage.generic"), $$0);
   }

   private static fnh.a a(wy $$0, wy $$1) {
      return new fnh.a($$0, $$1);
   }

   @Override
   public void aO_() {
      this.c(fta.a(wx.h, $$0 -> this.aL_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = ftt.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aL_() {
      this.m.a(this.a);
   }

   @Override
   public wy i() {
      return wy.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(wy a, wy b) {
   }
}
