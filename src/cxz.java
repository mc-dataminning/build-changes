public interface cxz<T extends cxu<?>> {
   cxz<cxl> a = a("crafting");
   cxz<cyj> b = a("smelting");
   cxz<cxg> c = a("blasting");
   cxz<cyn> d = a("smoking");
   cxz<cxi> e = a("campfire_cooking");
   cxz<cyo> f = a("stonecutting");
   cxz<cyk> g = a("smithing");

   static <T extends cxu<?>> cxz<T> a(final String $$0) {
      return jk.a(le.s, new akm($$0), new cxz<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
