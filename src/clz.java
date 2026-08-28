public abstract class clz extends cly {
   public clz(clw $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bus $$0, float $$1) {
      if (!($$0.c() instanceof crf) && !($$0.c() instanceof csl)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().e(1.0F);
         return 0.0F;
      }
   }
}
