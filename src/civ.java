public abstract class civ extends ciu {
   public civ(cis $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bsb $$0, float $$1) {
      if (!($$0.c() instanceof cnw) && !($$0.c() instanceof cpb)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().d(1.0F);
         return 0.0F;
      }
   }
}
