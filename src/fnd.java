public class fnd {
   private final fnf a;
   private final fne b;

   private fnd(fnf $$0, fne $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fmx a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fnd a(fnf $$0, int $$1, int $$2) {
      return new fnd($$0, new fne($$1, $$2));
   }
}
