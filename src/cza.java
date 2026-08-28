public interface cza<T extends cyv<?>> {
   cza<cym> a = a("crafting");
   cza<czk> b = a("smelting");
   cza<cyh> c = a("blasting");
   cza<czo> d = a("smoking");
   cza<cyj> e = a("campfire_cooking");
   cza<czp> f = a("stonecutting");
   cza<czl> g = a("smithing");

   static <T extends cyv<?>> cza<T> a(final String $$0) {
      return jv.a(lp.s, new alf($$0), new cza<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
