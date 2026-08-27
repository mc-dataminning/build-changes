public class cqr extends cpu {
   protected cqr(cpu.a $$0, bkv... $$1) {
      super($$0, cpv.g, $$1);
   }

   @Override
   public int a(int $$0) {
      return 15;
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public boolean a(cpu $$0) {
      return super.a($$0) && $$0 != cpy.x;
   }
}
