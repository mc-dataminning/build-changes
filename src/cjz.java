public abstract class cjz extends cjy {
   public cjz(cjw $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(btc $$0, float $$1) {
      if (!($$0.c() instanceof cpf) && !($$0.c() instanceof cqj)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
