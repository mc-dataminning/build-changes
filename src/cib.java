public abstract class cib extends cia {
   public cib(chy $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(brj $$0, float $$1) {
      if (!($$0.c() instanceof cnb) && !($$0.c() instanceof cof)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
