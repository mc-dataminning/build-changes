public abstract class cks extends ckr {
   public cks(ckp $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(btv $$0, float $$1) {
      if (!($$0.c() instanceof cpz) && !($$0.c() instanceof crd)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
