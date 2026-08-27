public class fpp {
   private final fpr a;
   private final fpq b;

   private fpp(fpr $$0, fpq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fpj a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fpp a(fpr $$0, int $$1, int $$2) {
      return new fpp($$0, new fpq($$1, $$2));
   }
}
