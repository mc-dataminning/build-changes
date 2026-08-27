public class fnp {
   private final fnr a;
   private final fnq b;

   private fnp(fnr $$0, fnq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fnj a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static fnp a(fnr $$0, int $$1, int $$2) {
      return new fnp($$0, new fnq($$1, $$2));
   }
}
