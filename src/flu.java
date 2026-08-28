public class flu extends hol {
   private final fxi a;
   private final flu.a b;
   private fsj c = fsj.a;

   public flu(flc $$0, fxi $$1) {
      super(fnw.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public flu(ww $$0, fxi $$1) {
      super(fnw.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public flu(ww $$0, ww $$1, fxi $$2) {
      super(fnw.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static flu.a a(flc $$0) {
      fji $$1 = $$0.a;
      return a(ww.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static flu.a a(ww $$0) {
      return a(ww.c("mco.errorMessage.generic"), $$0);
   }

   private static flu.a a(ww $$0, ww $$1) {
      return new flu.a($$0, $$1);
   }

   @Override
   public void aN_() {
      this.c(frq.a(wv.h, $$0 -> this.aK_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fsj.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aK_() {
      this.m.a(this.a);
   }

   @Override
   public ww i() {
      return ww.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(ww a, ww b) {
   }
}
