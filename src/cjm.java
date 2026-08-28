public abstract class cjm extends cjl {
   public cjm(cjj $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bsp $$0, float $$1) {
      if (!($$0.c() instanceof cop) && !($$0.c() instanceof cpt)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
