public abstract class ckw extends ckv {
   public ckw(ckt $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(btz $$0, float $$1) {
      if (!($$0.c() instanceof cqd) && !($$0.c() instanceof crh)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
