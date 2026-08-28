public interface dcp<T extends dce<?>> {
   dcp<dbt> a = a("crafting");
   dcp<dcy> b = a("smelting");
   dcp<dbn> c = a("blasting");
   dcp<ddd> d = a("smoking");
   dcp<dbp> e = a("campfire_cooking");
   dcp<dde> f = a("stonecutting");
   dcp<dcz> g = a("smithing");

   static <T extends dce<?>> dcp<T> a(final String $$0) {
      return kd.a(ma.q, alz.b($$0), new dcp<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
