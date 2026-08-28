public class dbj extends dbf {
   public dbj(String $$0, dbm $$1, dbv $$2, cxk $$3, float $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected cxg f() {
      return cxo.xc;
   }

   @Override
   public dci<dbj> a() {
      return dci.p;
   }

   @Override
   public dcj<dbj> b() {
      return dcj.c;
   }

   @Override
   public dbi h() {
      return switch (this.e()) {
         case b -> dbi.h;
         case a, c -> dbi.i;
      };
   }
}
