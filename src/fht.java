public class fht {
   private final fhv a;
   private final fhu b;

   private fht(fhv $$0, fhu $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fhn a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fht a(fhv $$0, int $$1, int $$2) {
      return new fht($$0, new fhu($$1, $$2));
   }
}
