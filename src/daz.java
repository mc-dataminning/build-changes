public interface daz<T extends dat<?>> {
   daz<daj> a = a("crafting");
   daz<dbj> b = a("smelting");
   daz<dad> c = a("blasting");
   daz<dbo> d = a("smoking");
   daz<daf> e = a("campfire_cooking");
   daz<dbp> f = a("stonecutting");
   daz<dbk> g = a("smithing");

   static <T extends dat<?>> daz<T> a(final String $$0) {
      return kd.a(lz.q, all.b($$0), new daz<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
