public class fki extends fkh {
   private final wy a;

   public fki(wy $$0) {
      this.a = $$0;
   }

   public fki(String $$0) {
      this(wy.b($$0));
   }

   @Override
   public wy a() {
      return wy.a("mco.upload.failed", this.a);
   }
}
