public class dbn extends dbk {
   public dbn(String $$0, dbq $$1, dca $$2, cxp $$3, float $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected cxl f() {
      return cxt.xc;
   }

   @Override
   public dco<dbn> a() {
      return dco.p;
   }

   @Override
   public dcp<dbn> b() {
      return dcp.c;
   }

   @Override
   public dch h() {
      return switch (this.e()) {
         case b -> dcg.h;
         case a, c -> dcg.i;
      };
   }
}
