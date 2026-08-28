public abstract class cna extends cmz {
   public cna(cmx $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bvk $$0, float $$1) {
      if (!($$0.c() instanceof csh) && !($$0.c() instanceof ctn)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().e(1.0F);
         return 0.0F;
      }
   }
}
