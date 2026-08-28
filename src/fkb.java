public class fkb extends fka {
   private final wy a;

   public fkb(wy $$0) {
      this.a = $$0;
   }

   public fkb(String $$0) {
      this(wy.b($$0));
   }

   @Override
   public wy a() {
      return wy.a("mco.upload.failed", this.a);
   }
}
