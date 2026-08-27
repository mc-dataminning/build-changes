public class cqf extends cpu {
   public cqf(cpu.a $$0, bkv... $$1) {
      super($$0, cpv.m, $$1);
   }

   @Override
   public int a(int $$0) {
      return 20;
   }

   @Override
   public int b(int $$0) {
      return 50;
   }

   @Override
   public boolean a(cpu $$0) {
      return super.a($$0) && $$0 != cpy.K;
   }
}
