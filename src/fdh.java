public class fdh extends gvs {
   private final fnj a;
   private final fdh.a b;
   private fil c = fil.a;

   public fdh(fcp $$0, fnj $$1) {
      super(ffl.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fdh(wu $$0, fnj $$1) {
      super(ffl.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fdh(wu $$0, wu $$1, fnj $$2) {
      super(ffl.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fdh.a a(fcp $$0) {
      fbe $$1 = $$0.a;
      return a(wu.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fdh.a a(wu $$0) {
      return a(wu.c("mco.errorMessage.generic"), $$0);
   }

   private static fdh.a a(wu $$0, wu $$1) {
      return new fdh.a($$0, $$1);
   }

   @Override
   public void aP_() {
      this.c(fhs.a(wt.h, $$0 -> this.d()).a(this.m / 2 - 100, this.n - 52, 200, 20).a());
      this.c = fil.a(this.o, this.b.b, this.m * 3 / 4);
   }

   @Override
   public void d() {
      this.l.a(this.a);
   }

   @Override
   public wu i() {
      return wu.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.b.a, this.m / 2, 80, -1);
      this.c.a($$0, this.m / 2, 100, 9, -2142128);
   }

   static record a(wu a, wu b) {
   }
}
