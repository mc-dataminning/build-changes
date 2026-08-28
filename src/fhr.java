public class fhr extends fhq {
   private final xv a;

   public fhr(xv $$0) {
      this.a = $$0;
   }

   public fhr(String $$0) {
      this(xv.b($$0));
   }

   @Override
   public xv a() {
      return xv.a("mco.upload.failed", this.a);
   }
}
