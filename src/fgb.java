public class fgb extends hdp {
   private final fqh a;
   private final fgb.a b;
   private flh c = flh.a;

   public fgb(ffj $$0, fqh $$1) {
      super(fig.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fgb(xe $$0, fqh $$1) {
      super(fig.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fgb(xe $$0, xe $$1, fqh $$2) {
      super(fig.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fgb.a a(ffj $$0) {
      fea $$1 = $$0.a;
      return a(xe.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fgb.a a(xe $$0) {
      return a(xe.c("mco.errorMessage.generic"), $$0);
   }

   private static fgb.a a(xe $$0, xe $$1) {
      return new fgb.a($$0, $$1);
   }

   @Override
   public void aS_() {
      this.c(fko.a(xd.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = flh.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public xe i() {
      return xe.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(xe a, xe b) {
   }
}
