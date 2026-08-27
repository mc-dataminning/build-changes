public class cwo extends cwq {
   protected cwo(cwq.a $$0, bqc... $$1) {
      super($$0, avk.bm, $$1);
   }

   @Override
   public int a(int $$0) {
      return 5 + ($$0 - 1) * 8;
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public int a() {
      return 3;
   }

   @Override
   public boolean a(crj $$0) {
      return $$0.b(jp.c) ? false : super.a($$0);
   }

   public static boolean a(crj $$0, int $$1, axr $$2) {
      return $$0.f() instanceof coy && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
