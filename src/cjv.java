public abstract class cjv extends cju {
   public cjv(cjs $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bsy $$0, float $$1) {
      if (!($$0.c() instanceof coy) && !($$0.c() instanceof cqc)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
