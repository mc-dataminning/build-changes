public abstract class cko extends ckn {
   public cko(ckl $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(btr $$0, float $$1) {
      if (!($$0.c() instanceof cpv) && !($$0.c() instanceof cqz)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
