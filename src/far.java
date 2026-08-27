public class far extends gtb {
   private final fld a;
   private final far.a b;
   private ffx c = ffx.a;

   public far(faa $$0, fld $$1) {
      super(fcw.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public far(wu $$0, fld $$1) {
      super(fcw.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public far(wu $$0, wu $$1, fld $$2) {
      super(fcw.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static far.a a(faa $$0) {
      eyp $$1 = $$0.a;
      return a(wu.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static far.a a(wu $$0) {
      return a(wu.c("mco.errorMessage.generic"), $$0);
   }

   private static far.a a(wu $$0, wu $$1) {
      return new far.a($$0, $$1);
   }

   @Override
   public void aM_() {
      this.c(ffe.a(wt.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = ffx.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public wu i() {
      return wu.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(wu a, wu b) {
   }
}
