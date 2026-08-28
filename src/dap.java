public interface dap<T extends daj<?>> {
   dap<czz> a = a("crafting");
   dap<dba> b = a("smelting");
   dap<czt> c = a("blasting");
   dap<dbf> d = a("smoking");
   dap<czv> e = a("campfire_cooking");
   dap<dbg> f = a("stonecutting");
   dap<dbb> g = a("smithing");

   static <T extends daj<?>> dap<T> a(final String $$0) {
      return kc.a(lx.q, alh.b($$0), new dap<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
