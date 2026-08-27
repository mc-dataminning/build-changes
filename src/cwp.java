public class cwp extends cwq {
   protected cwp(cwq.a $$0, bqc... $$1) {
      super($$0, avk.bi, $$1);
   }

   @Override
   public int a(int $$0) {
      return 1 + 10 * ($$0 - 1);
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public int a() {
      return 5;
   }
}
