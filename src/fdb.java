public class fdb extends gvm {
   private final fnd a;
   private final fdb.a b;
   private fif c = fif.a;

   public fdb(fcj $$0, fnd $$1) {
      super(fff.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fdb(wu $$0, fnd $$1) {
      super(fff.a);
      this.a = $$1;
      this.b = a($$0);
   }

   public fdb(wu $$0, wu $$1, fnd $$2) {
      super(fff.a);
      this.a = $$2;
      this.b = a($$0, $$1);
   }

   private static fdb.a a(fcj $$0) {
      fay $$1 = $$0.a;
      return a(wu.a("mco.errorMessage.realmsService.realmsError", $$1.a()), $$1.b());
   }

   private static fdb.a a(wu $$0) {
      return a(wu.c("mco.errorMessage.generic"), $$0);
   }

   private static fdb.a a(wu $$0, wu $$1) {
      return new fdb.a($$0, $$1);
   }

   @Override
   public void aO_() {
      this.c(fhm.a(wt.h, $$0 -> this.d()).a(this.m / 2 - 100, this.n - 52, 200, 20).a());
      this.c = fif.a(this.o, this.b.b, this.m * 3 / 4);
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
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.b.a, this.m / 2, 80, -1);
      this.c.a($$0, this.m / 2, 100, 9, -2142128);
   }

   static record a(wu a, wu b) {
   }
}
