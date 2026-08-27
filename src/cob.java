public class cob extends cne {
   protected cob(cne.a $$0, bin... $$1) {
      super($$0, cnf.g, $$1);
   }

   @Override
   public int a(int $$0) {
      return 15;
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public boolean a(cne $$0) {
      return super.a($$0) && $$0 != cni.x;
   }
}
