public class cpp extends cpu {
   public cpp(cpu.a $$0, bkv... $$1) {
      super($$0, cpv.m, $$1);
   }

   @Override
   public int a(int $$0) {
      return 1 + ($$0 - 1) * 10;
   }

   @Override
   public int b(int $$0) {
      return 50;
   }

   @Override
   public int a() {
      return 4;
   }

   @Override
   public boolean a(cpu $$0) {
      return super.a($$0) && $$0 != cpy.I;
   }
}
