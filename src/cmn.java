public abstract class cmn extends cmm {
   public cmn(cmk $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bux $$0, float $$1) {
      if (!($$0.c() instanceof cru) && !($$0.c() instanceof cta)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().e(1.0F);
         return 0.0F;
      }
   }
}
