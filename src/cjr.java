public abstract class cjr extends cjq {
   public cjr(cjo $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bsu $$0, float $$1) {
      if (!($$0.c() instanceof cou) && !($$0.c() instanceof cpy)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
