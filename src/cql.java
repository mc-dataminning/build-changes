public class cql extends cpm {
   public cql(cpm.a $$0, bkn... $$1) {
      super($$0, cpn.b, $$1);
   }

   @Override
   public int a(int $$0) {
      return $$0 * 10;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 15;
   }

   @Override
   public int a() {
      return 3;
   }

   @Override
   public boolean a(cpm $$0) {
      return super.a($$0) && $$0 != cpq.j;
   }
}
