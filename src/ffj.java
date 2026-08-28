public class ffj extends ffi {
   private final xl a;

   public ffj(xl $$0) {
      this.a = $$0;
   }

   public ffj(String $$0) {
      this(xl.b($$0));
   }

   @Override
   public xl a() {
      return xl.a("mco.upload.failed", this.a);
   }
}
