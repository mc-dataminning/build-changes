public abstract class cja extends ciz {
   public cja(cix $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bsg $$0, float $$1) {
      if (!($$0.c() instanceof cob) && !($$0.c() instanceof cpg)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
