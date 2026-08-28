public abstract class cjd extends cjc {
   public cjd(cja $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bsj $$0, float $$1) {
      if (!($$0.c() instanceof coe) && !($$0.c() instanceof cpj)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
