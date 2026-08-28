public abstract class cid extends cic {
   public cid(cia $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(brm $$0, float $$1) {
      if (!($$0.c() instanceof cnc) && !($$0.c() instanceof cog)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().g(1);
         return 0.0F;
      }
   }
}
