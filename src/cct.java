public abstract class cct extends ccs {
   public cct(ccq $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bmp $$0, float $$1) {
      if ($$0.c() instanceof chr) {
         $$0.c().g(1);
         return 0.0F;
      } else {
         return super.a($$0, $$1);
      }
   }
}
