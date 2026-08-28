public abstract class cic extends cib {
   public cic(chz $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(brl $$0, float $$1) {
      if (!($$0.c() instanceof cnb) && !($$0.c() instanceof cof)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().g(1);
         return 0.0F;
      }
   }
}
