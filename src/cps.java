public class cps extends cpu {
   protected cps(cpu.a $$0, bkv... $$1) {
      super($$0, cpv.j, $$1);
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
   public boolean a(clj $$0) {
      return $$0.i() ? true : super.a($$0);
   }

   public static boolean a(clj $$0, int $$1, ats $$2) {
      return $$0.d() instanceof cit && $$2.i() < 0.6F ? false : $$2.a($$1 + 1) > 0;
   }
}
