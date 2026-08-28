public abstract class cjw extends cjv {
   public cjw(cjt $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bsz $$0, float $$1) {
      if (!($$0.c() instanceof cpc) && !($$0.c() instanceof cqg)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
