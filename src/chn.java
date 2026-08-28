public abstract class chn extends chm {
   public chn(chk $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bqw $$0, float $$1) {
      if (!($$0.c() instanceof cmn) && !($$0.c() instanceof cnr)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
