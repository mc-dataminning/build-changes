public interface dcj<T extends dbz<?>> {
   dcj<dbp> a = a("crafting");
   dcj<dcs> b = a("smelting");
   dcj<dbj> c = a("blasting");
   dcj<dcx> d = a("smoking");
   dcj<dbl> e = a("campfire_cooking");
   dcj<dcy> f = a("stonecutting");
   dcj<dct> g = a("smithing");

   static <T extends dbz<?>> dcj<T> a(final String $$0) {
      return kd.a(ma.q, alz.b($$0), new dcj<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
