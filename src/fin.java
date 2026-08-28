public class fin extends fim {
   private final wv a;

   public fin(wv $$0) {
      this.a = $$0;
   }

   public fin(String $$0) {
      this(wv.b($$0));
   }

   @Override
   public wv a() {
      return wv.a("mco.upload.failed", this.a);
   }
}
