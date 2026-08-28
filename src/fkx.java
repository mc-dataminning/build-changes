public class fkx extends fkw {
   private final wy a;

   public fkx(wy $$0) {
      this.a = $$0;
   }

   public fkx(String $$0) {
      this(wy.b($$0));
   }

   @Override
   public wy a() {
      return wy.a("mco.upload.failed", this.a);
   }
}
