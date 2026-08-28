public interface dcg<T extends dbv<?>> {
   dcg<dbk> a = a("crafting");
   dcg<dcp> b = a("smelting");
   dcg<dbe> c = a("blasting");
   dcg<dcu> d = a("smoking");
   dcg<dbg> e = a("campfire_cooking");
   dcg<dcv> f = a("stonecutting");
   dcg<dcq> g = a("smithing");

   static <T extends dbv<?>> dcg<T> a(final String $$0) {
      return kd.a(ma.q, alp.b($$0), new dcg<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
