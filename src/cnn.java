public class cnn extends cne {
   protected cnn(cne.a $$0, cnf $$1, bin... $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public int a(int $$0) {
      return 15 + ($$0 - 1) * 9;
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public int a() {
      return 3;
   }

   @Override
   public boolean a(cne $$0) {
      return super.a($$0) && $$0 != cni.v;
   }
}
