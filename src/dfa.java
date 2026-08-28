public interface dfa<T extends dep<?>> {
   dfa<dee> a = a("crafting");
   dfa<dfj> b = a("smelting");
   dfa<ddy> c = a("blasting");
   dfa<dfo> d = a("smoking");
   dfa<dea> e = a("campfire_cooking");
   dfa<dfp> f = a("stonecutting");
   dfa<dfk> g = a("smithing");

   static <T extends dep<?>> dfa<T> a(final String $$0) {
      return js.a(mg.q, ali.b($$0), new dfa<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
