public class ezc extends grl {
   private final fjo a;
   private final ezc.a b;
   private fei c = fei.a;

   public ezc(eyl $$0, fjo $$1) {
      super(fbh.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ezc(wg $$0, fjo $$1) {
      super(fbh.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ezc(wg $$0, wg $$1, fjo $$2) {
      super(fbh.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static ezc.a a(eyl $$0) {
      exa $$1 = $$0.a;
      return a(wg.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static ezc.a a(wg $$0) {
      return a(wg.c("mco.errorMessage.generic"), $$0);
   }

   private static ezc.a a(wg $$0, wg $$1) {
      return new ezc.a($$0, $$1);
   }

   @Override
   public void aN_() {
      this.c(fdp.a(wf.h, $$0 -> this.d()).a(this.k / 2 - 100, this.l - 52, 200, 20).a());
      this.c = fei.a(this.m, this.b.b, this.k * 3 / 4);
   }

   @Override
   public void d() {
      this.j.a(this.a);
   }

   @Override
   public wg i() {
      return wg.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.b.a, this.k / 2, 80, -1);
      this.c.a($$0, this.k / 2, 100, 9, -2142128);
   }

   static record a(wg a, wg b) {
   }
}
