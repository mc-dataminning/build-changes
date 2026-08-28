public interface dco<T extends dcd<?>> {
   dco<dbs> a = a("crafting");
   dco<dcx> b = a("smelting");
   dco<dbm> c = a("blasting");
   dco<ddc> d = a("smoking");
   dco<dbo> e = a("campfire_cooking");
   dco<ddd> f = a("stonecutting");
   dco<dcy> g = a("smithing");

   static <T extends dcd<?>> dco<T> a(final String $$0) {
      return kd.a(ma.q, alz.b($$0), new dco<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
