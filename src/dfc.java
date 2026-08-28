public interface dfc<T extends der<?>> {
   dfc<deg> a = a("crafting");
   dfc<dfl> b = a("smelting");
   dfc<dea> c = a("blasting");
   dfc<dfq> d = a("smoking");
   dfc<dec> e = a("campfire_cooking");
   dfc<dfr> f = a("stonecutting");
   dfc<dfm> g = a("smithing");

   static <T extends der<?>> dfc<T> a(final String $$0) {
      return jt.a(mh.q, alk.b($$0), new dfc<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
