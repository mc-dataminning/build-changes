public class crb extends crc {
   protected crb(crc.a $$0, blu... $$1) {
      super($$0, crd.g, $$1);
   }

   @Override
   public int a(int $$0) {
      return 1 + 10 * ($$0 - 1);
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public int a() {
      return 5;
   }

   @Override
   public boolean a(cmr $$0) {
      return $$0.a(cmu.rS) ? true : super.a($$0);
   }
}
