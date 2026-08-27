public class eod extends gex {
   private final eye a;
   private final eod.a b;
   private etd c = etd.a;

   public eod(enm $$0, eye $$1) {
      super(eqh.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eod(tl $$0, eye $$1) {
      super(eqh.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eod(tl $$0, tl $$1, eye $$2) {
      super(eqh.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static eod.a a(enm $$0) {
      emb $$1 = $$0.a;
      return a(tl.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static eod.a a(tl $$0) {
      return a(tl.c("mco.errorMessage.generic"), $$0);
   }

   private static eod.a a(tl $$0, tl $$1) {
      return new eod.a($$0, $$1);
   }

   @Override
   public void aH_() {
      this.d(esk.a(tk.h, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = etd.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public tl g() {
      return tl.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -65536);
   }

   static record a(tl a, tl b) {
   }
}
