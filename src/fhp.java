public class fhp {
   private final fhr a;
   private final fhq b;

   private fhp(fhr $$0, fhq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fhj a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fhp a(fhr $$0, int $$1, int $$2) {
      return new fhp($$0, new fhq($$1, $$2));
   }
}
