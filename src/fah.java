public class fah extends gsq {
   private final fkt a;
   private final fah.a b;
   private ffn c = ffn.a;

   public fah(ezq $$0, fkt $$1) {
      super(fcm.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fah(ws $$0, fkt $$1) {
      super(fcm.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fah(ws $$0, ws $$1, fkt $$2) {
      super(fcm.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fah.a a(ezq $$0) {
      eyf $$1 = $$0.a;
      return a(ws.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fah.a a(ws $$0) {
      return a(ws.c("mco.errorMessage.generic"), $$0);
   }

   private static fah.a a(ws $$0, ws $$1) {
      return new fah.a($$0, $$1);
   }

   @Override
   public void aM_() {
      this.c(feu.a(wr.h, $$0 -> this.d()).a(this.n / 2 - 100, this.o - 52, 200, 20).a());
      this.c = ffn.a(this.p, this.b.b, this.n * 3 / 4);
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public ws i() {
      return ws.i().b(this.b.a).f(": ").b(this.b.b);
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.b.a, this.n / 2, 80, -1);
      this.c.a($$0, this.n / 2, 100, 9, -2142128);
   }

   static record a(ws a, ws b) {
   }
}
