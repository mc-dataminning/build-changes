public class ffq extends ffp {
   private final xj a;

   public ffq(xj $$0) {
      this.a = $$0;
   }

   public ffq(String $$0) {
      this(xj.b($$0));
   }

   @Override
   public xj a() {
      return xj.a("mco.upload.failed", this.a);
   }
}
