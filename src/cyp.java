public interface cyp<T extends cyj<?>> {
   cyp<cya> a = a("crafting");
   cyp<cza> b = a("smelting");
   cyp<cxu> c = a("blasting");
   cyp<czf> d = a("smoking");
   cyp<cxw> e = a("campfire_cooking");
   cyp<czg> f = a("stonecutting");
   cyp<czb> g = a("smithing");

   static <T extends cyj<?>> cyp<T> a(final String $$0) {
      return jw.a(lq.q, new akk($$0), new cyp<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
