public abstract class cnj extends cni {
   public cnj(cng $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bvt $$0, float $$1) {
      if (!($$0.c() instanceof csq) && !($$0.c() instanceof ctw)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().e(1.0F);
         return 0.0F;
      }
   }
}
