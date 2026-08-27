public class cpt extends cpu {
   protected cpt(cpu.a $$0, bkv... $$1) {
      super($$0, cpv.g, $$1);
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

   @Override
   public boolean a(clj $$0) {
      return $$0.a(clm.rS) ? true : super.a($$0);
   }
}
