public class fhq extends fhp {
   private final xv a;

   public fhq(xv $$0) {
      this.a = $$0;
   }

   public fhq(String $$0) {
      this(xv.b($$0));
   }

   @Override
   public xv a() {
      return xv.a("mco.upload.failed", this.a);
   }
}
