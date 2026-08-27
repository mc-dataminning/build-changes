public class cqg extends cpu {
   public cqg(cpu.a $$0, bkv... $$1) {
      super($$0, cpv.e, $$1);
   }

   @Override
   public int a(int $$0) {
      return 10 * $$0;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 30;
   }

   @Override
   public int a() {
      return 3;
   }
}
