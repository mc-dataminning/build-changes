public class ewv extends gpe {
   private final fhh a;
   private final ewv.a b;
   private fcb c = fcb.a;

   public ewv(ewe $$0, fhh $$1) {
      super(eza.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ewv(vu $$0, fhh $$1) {
      super(eza.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ewv(vu $$0, vu $$1, fhh $$2) {
      super(eza.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static ewv.a a(ewe $$0) {
      eut $$1 = $$0.a;
      return a(vu.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static ewv.a a(vu $$0) {
      return a(vu.c("mco.errorMessage.generic"), $$0);
   }

   private static ewv.a a(vu $$0, vu $$1) {
      return new ewv.a($$0, $$1);
   }

   @Override
   public void aO_() {
      this.c(fbi.a(vt.h, $$0 -> this.d()).a(this.g / 2 - 100, this.h - 52, 200, 20).a());
      this.c = fcb.a(this.i, this.b.b, this.g * 3 / 4);
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
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.b.a, this.g / 2, 80, -1);
      this.c.a($$0, this.g / 2, 100, 9, -2142128);
   }

   static record a(vu a, vu b) {
   }
}
