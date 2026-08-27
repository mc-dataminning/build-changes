public class cqj extends cpu {
   public cqj(cpu.a $$0, bkv... $$1) {
      super($$0, cpv.b, $$1);
   }

   @Override
   public int a(int $$0) {
      return $$0 * 10;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 15;
   }

   @Override
   public boolean b() {
      return true;
   }

   @Override
   public boolean h() {
      return false;
   }

   @Override
   public boolean i() {
      return false;
   }

   @Override
   public int a() {
      return 3;
   }
}
