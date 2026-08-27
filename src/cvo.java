public interface cvo<T extends cvj<?>> {
   cvo<cva> a = a("crafting");
   cvo<cvy> b = a("smelting");
   cvo<cuv> c = a("blasting");
   cvo<cwc> d = a("smoking");
   cvo<cux> e = a("campfire_cooking");
   cvo<cwd> f = a("stonecutting");
   cvo<cvz> g = a("smithing");

   static <T extends cvj<?>> cvo<T> a(final String $$0) {
      return iy.a(kr.s, new ajt($$0), new cvo<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
