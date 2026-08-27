public class cqt extends cpu {
   public cqt(cpu.a $$0, bkv... $$1) {
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
   public int a() {
      return 3;
   }

   @Override
   public boolean a(cpu $$0) {
      return super.a($$0) && $$0 != cpy.j;
   }
}
