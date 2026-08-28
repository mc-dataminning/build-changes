public class fhk extends fhj {
   private final xk a;

   public fhk(xk $$0) {
      this.a = $$0;
   }

   public fhk(String $$0) {
      this(xk.b($$0));
   }

   @Override
   public xk a() {
      return xk.a("mco.upload.failed", this.a);
   }
}
