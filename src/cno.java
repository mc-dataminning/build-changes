public class cno extends cne {
   public cno(cne.a $$0, bin... $$1) {
      super($$0, cnf.j, $$1);
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
