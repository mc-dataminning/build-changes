public abstract class cif extends cie {
   public cif(cic $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(bro $$0, float $$1) {
      if (!($$0.c() instanceof cne) && !($$0.c() instanceof coi)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().g(1);
         return 0.0F;
      }
   }
}
