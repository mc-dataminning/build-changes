public abstract class cjx extends cjw {
   public cjx(cju $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bta $$0, float $$1) {
      if (!($$0.c() instanceof cpe) && !($$0.c() instanceof cqi)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
