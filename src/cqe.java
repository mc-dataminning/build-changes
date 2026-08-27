public class cqe extends cpu {
   public cqe(cpu.a $$0, bkv... $$1) {
      super($$0, cpv.j, $$1);
   }

   @Override
   public int a(int $$0) {
      return $$0 * 25;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 50;
   }

   @Override
   public boolean b() {
      return true;
   }
}
