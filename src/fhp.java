public class fhp extends fho {
   private final xv a;

   public fhp(xv $$0) {
      this.a = $$0;
   }

   public fhp(String $$0) {
      this(xv.b($$0));
   }

   @Override
   public xv a() {
      return xv.a("mco.upload.failed", this.a);
   }
}
