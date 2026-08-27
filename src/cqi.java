public class cqi extends cpu {
   public cqi(cpu.a $$0, bkv... $$1) {
      super($$0, cpv.m, $$1);
   }

   @Override
   public int a(int $$0) {
      return 12 + ($$0 - 1) * 20;
   }

   @Override
   public int b(int $$0) {
      return 50;
   }

   @Override
   public int a() {
      return 3;
   }
}
