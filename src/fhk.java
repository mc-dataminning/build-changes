public class fhk extends fhj {
   private final xv a;

   public fhk(xv $$0) {
      this.a = $$0;
   }

   public fhk(String $$0) {
      this(xv.b($$0));
   }

   @Override
   public xv a() {
      return xv.a("mco.upload.failed", this.a);
   }
}
