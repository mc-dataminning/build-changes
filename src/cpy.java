public class cpy extends cpz {
   protected cpy(cpz.a $$0, bla... $$1) {
      super($$0, cqa.g, $$1);
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
   public boolean a(clo $$0) {
      return $$0.a(clr.rS) ? true : super.a($$0);
   }
}
