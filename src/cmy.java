public abstract class cmy extends cmx {
   public cmy(cmv $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bvi $$0, float $$1) {
      if (!($$0.c() instanceof csf) && !($$0.c() instanceof ctl)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().e(1.0F);
         return 0.0F;
      }
   }
}
