public class eoe extends gew {
   private final eyf a;
   private final eoe.a b;
   private ete c = ete.a;

   public eoe(enn $$0, eyf $$1) {
      super(eqi.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eoe(ti $$0, eyf $$1) {
      super(eqi.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public eoe(ti $$0, ti $$1, eyf $$2) {
      super(eqi.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static eoe.a a(enn $$0) {
      emc $$1 = $$0.a;
      return a(ti.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static eoe.a a(ti $$0) {
      return a(ti.c("mco.errorMessage.generic"), $$0);
   }

   private static eoe.a a(ti $$0, ti $$1) {
      return new eoe.a($$0, $$1);
   }

   @Override
   public void aD_() {
      this.d(esl.a(th.h, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = ete.a(this.i, this.b.b, this.g * 3 / 4);
   }

   @Override
   public ti g() {
      return ti.h().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -65536);
   }

   static record a(ti a, ti b) {
   }
}
