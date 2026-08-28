public abstract class clj extends cli {
   public clj(clg $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(buh $$0, float $$1) {
      if (!($$0.c() instanceof cqp) && !($$0.c() instanceof crt)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().e(1.0F);
         return 0.0F;
      }
   }
}
