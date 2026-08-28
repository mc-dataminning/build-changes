public abstract class cjy extends cjx {
   public cjy(cjv $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(btb $$0, float $$1) {
      if (!($$0.c() instanceof cpb) && !($$0.c() instanceof cqf)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
