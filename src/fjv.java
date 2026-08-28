public class fjv extends hmd {
   private final fvi a;
   private final fjv.a b;
   private fqj c = fqj.a;

   public fjv(fjd $$0, fvi $$1) {
      super(flx.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fjv(wp $$0, fvi $$1) {
      super(flx.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fjv(wp $$0, wp $$1, fvi $$2) {
      super(flx.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fjv.a a(fjd $$0) {
      fhj $$1 = $$0.a;
      return a(wp.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fjv.a a(wp $$0) {
      return a(wp.c("mco.errorMessage.generic"), $$0);
   }

   private static fjv.a a(wp $$0, wp $$1) {
      return new fjv.a($$0, $$1);
   }

   @Override
   public void aR_() {
      this.c(fpq.a(wo.h, $$0 -> this.aO_()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = fqj.a(this.p, this.b.b, this.n * 3 / 4);
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
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(wp a, wp b) {
   }
}
