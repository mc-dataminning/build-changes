public class cnu extends cne {
   public cnu(cne.a $$0, bin... $$1) {
      super($$0, cnf.f, $$1);
   }

   @Override
   public int a(int $$0) {
      return 5 + ($$0 - 1) * 9;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 15;
   }

   @Override
   public int a() {
      return 3;
   }

   public static float e(int $$0) {
      return 1.0F - 1.0F / (float)($$0 + 1);
   }
}
