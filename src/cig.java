public abstract class cig extends cif {
   public cig(cid $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(brp $$0, float $$1) {
      if (!($$0.c() instanceof cnf) && !($$0.c() instanceof coj)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().g(1);
         return 0.0F;
      }
   }
}
