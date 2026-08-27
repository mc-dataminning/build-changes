public class epb extends gfx {
   private final ezd a;
   private final epb.a b;
   private euc c = euc.a;

   public epb(eok $$0, ezd $$1) {
      super(erg.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public epb(ui $$0, ezd $$1) {
      super(erg.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public epb(ui $$0, ui $$1, ezd $$2) {
      super(erg.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static epb.a a(eok $$0) {
      emz $$1 = $$0.a;
      return a(ui.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static epb.a a(ui $$0) {
      return a(ui.c("mco.errorMessage.generic"), $$0);
   }

   private static epb.a a(ui $$0, ui $$1) {
      return new epb.a($$0, $$1);
   }

   @Override
   public void aM_() {
      this.d(etj.a(uh.h, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = euc.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public ui h() {
      return ui.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -2142128);
   }

   static record a(ui a, ui b) {
   }
}
