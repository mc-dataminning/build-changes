public class fix extends hld {
   private final fuk a;
   private final fix.a b;
   private fpl c = fpl.a;

   public fix(fif $$0, fuk $$1) {
      super(fkz.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fix(wp $$0, fuk $$1) {
      super(fkz.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fix(wp $$0, wp $$1, fuk $$2) {
      super(fkz.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fix.a a(fif $$0) {
      fgl $$1 = $$0.a;
      return a(wp.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fix.a a(wp $$0) {
      return a(wp.c("mco.errorMessage.generic"), $$0);
   }

   private static fix.a a(wp $$0, wp $$1) {
      return new fix.a($$0, $$1);
   }

   @Override
   public void aR_() {
      this.c(fos.a(wo.h, $$0 -> this.aO_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fpl.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void aO_() {
      this.m.a(this.a);
   }

   @Override
   public wp i() {
      return wp.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(wp a, wp b) {
   }
}
