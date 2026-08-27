public class ewt extends gpb {
   private final fhf a;
   private final ewt.a b;
   private fbz c = fbz.a;

   public ewt(ewc $$0, fhf $$1) {
      super(eyy.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ewt(vu $$0, fhf $$1) {
      super(eyy.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ewt(vu $$0, vu $$1, fhf $$2) {
      super(eyy.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static ewt.a a(ewc $$0) {
      eur $$1 = $$0.a;
      return a(vu.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static ewt.a a(vu $$0) {
      return a(vu.c("mco.errorMessage.generic"), $$0);
   }

   private static ewt.a a(vu $$0, vu $$1) {
      return new ewt.a($$0, $$1);
   }

   @Override
   public void aO_() {
      this.c(fbg.a(vt.h, $$0 -> this.d()).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = fbz.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public void d() {
      this.f.a(this.a);
   }

   @Override
   public vu i() {
      return vu.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -2142128);
   }

   static record a(vu a, vu b) {
   }
}
