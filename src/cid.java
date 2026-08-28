public abstract class cid extends cic {
   public cid(cia $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(brk $$0, float $$1) {
      if (!($$0.c() instanceof cnd) && !($$0.c() instanceof coh)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
