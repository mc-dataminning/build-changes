public class dcs extends dbf {
   public dcs(String $$0, dbm $$1, dbv $$2, cxk $$3, float $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected cxg f() {
      return cxo.fc;
   }

   @Override
   public dci<dcs> a() {
      return dci.o;
   }

   @Override
   public dcj<dcs> b() {
      return dcj.b;
   }

   @Override
   public dbi h() {
      return switch (this.e()) {
         case b -> dbi.f;
         case a -> dbi.e;
         case c -> dbi.g;
      };
   }
}
