public class flz extends fly {
   private final xg a;

   public flz(xg $$0) {
      this.a = $$0;
   }

   public flz(String $$0) {
      this(xg.b($$0));
   }

   @Override
   public xg a() {
      return xg.a("mco.upload.failed", this.a);
   }
}
