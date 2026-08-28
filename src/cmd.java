public abstract class cmd extends cmc {
   public cmd(cma $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(buu $$0, float $$1) {
      if (!($$0.c() instanceof crk) && !($$0.c() instanceof csq)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().e(1.0F);
         return 0.0F;
      }
   }
}
