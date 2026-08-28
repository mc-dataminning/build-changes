public abstract class cks extends ckr {
   public cks(ckp $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(btp $$0, float $$1) {
      if (!($$0.c() instanceof cpy) && !($$0.c() instanceof crc)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().e(1.0F);
         return 0.0F;
      }
   }
}
