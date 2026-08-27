public class ezl extends gru {
   private final fjx a;
   private final ezl.a b;
   private fer c = fer.a;

   public ezl(eyu $$0, fjx $$1) {
      super(fbq.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ezl(wi $$0, fjx $$1) {
      super(fbq.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public ezl(wi $$0, wi $$1, fjx $$2) {
      super(fbq.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static ezl.a a(eyu $$0) {
      exj $$1 = $$0.a;
      return a(wi.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static ezl.a a(wi $$0) {
      return a(wi.c("mco.errorMessage.generic"), $$0);
   }

   private static ezl.a a(wi $$0, wi $$1) {
      return new ezl.a($$0, $$1);
   }

   @Override
   public void aM_() {
      this.c(fdy.a(wh.h, $$0 -> this.d()).a(this.k / 2 - 100, this.l - 52, 200, 20).a());
      this.c = fer.a(this.m, this.b.b, this.k * 3 / 4);
   }

   @Override
   public void d() {
      this.j.a(this.a);
   }

   @Override
   public wi i() {
      return wi.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.b.a, this.k / 2, 80, -1);
      this.c.a($$0, this.k / 2, 100, 9, -2142128);
   }

   static record a(wi a, wi b) {
   }
}
