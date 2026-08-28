public class flc extends flb {
   private final wy a;

   public flc(wy $$0) {
      this.a = $$0;
   }

   public flc(String $$0) {
      this(wy.b($$0));
   }

   @Override
   public wy a() {
      return wy.a("mco.upload.failed", this.a);
   }
}
