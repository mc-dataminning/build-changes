public class fdw extends gxb {
   private final fon a;
   private final fdw.a b;
   private fjg c = fjg.a;

   public fdw(fdf $$0, fon $$1) {
      super(fgb.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fdw(xe $$0, fon $$1) {
      super(fgb.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fdw(xe $$0, xe $$1, fon $$2) {
      super(fgb.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fdw.a a(fdf $$0) {
      fbu $$1 = $$0.a;
      return a(xe.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fdw.a a(xe $$0) {
      return a(xe.c("mco.errorMessage.generic"), $$0);
   }

   private static fdw.a a(xe $$0, xe $$1) {
      return new fdw.a($$0, $$1);
   }

   @Override
   public void aN_() {
      this.c(fin.a(xd.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fjg.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public xe i() {
      return xe.i().a(this.b.a).f(": ").a(this.b.b);
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xe a, xe b) {
   }
}
