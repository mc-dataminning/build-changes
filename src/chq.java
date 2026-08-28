public abstract class chq extends chp {
   public chq(chn $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bqz $$0, float $$1) {
      if (!($$0.c() instanceof cmq) && !($$0.c() instanceof cnu)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
