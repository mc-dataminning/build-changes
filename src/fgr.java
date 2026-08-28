public class fgr extends fgq {
   private final wo a;

   public fgr(wo $$0) {
      this.a = $$0;
   }

   public fgr(String $$0) {
      this(wo.b($$0));
   }

   @Override
   public wo a() {
      return wo.a("mco.upload.failed", this.a);
   }
}
