public interface cxi<T extends cxd<?>> {
   cxi<cwu> a = a("crafting");
   cxi<cxs> b = a("smelting");
   cxi<cwp> c = a("blasting");
   cxi<cxw> d = a("smoking");
   cxi<cwr> e = a("campfire_cooking");
   cxi<cxx> f = a("stonecutting");
   cxi<cxt> g = a("smithing");

   static <T extends cxd<?>> cxi<T> a(final String $$0) {
      return jj.a(ld.s, new akh($$0), new cxi<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
