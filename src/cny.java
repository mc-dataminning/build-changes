public class cny extends cno {
   public cny(cno.a $$0, biv... $$1) {
      super($$0, cnp.j, $$1);
   }

   @Override
   public int a(int $$0) {
      return $$0 * 25;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 50;
   }

   @Override
   public boolean b() {
      return true;
   }
}
