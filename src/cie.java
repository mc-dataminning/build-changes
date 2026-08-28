public abstract class cie extends cid {
   public cie(cib $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(brn $$0, float $$1) {
      if (!($$0.c() instanceof cnd) && !($$0.c() instanceof coh)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().g(1);
         return 0.0F;
      }
   }
}
