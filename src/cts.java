public interface cts<T extends ctn<?>> {
   cts<cte> a = a("crafting");
   cts<cuc> b = a("smelting");
   cts<csz> c = a("blasting");
   cts<cug> d = a("smoking");
   cts<ctb> e = a("campfire_cooking");
   cts<cuh> f = a("stonecutting");
   cts<cud> g = a("smithing");

   static <T extends ctn<?>> cts<T> a(final String $$0) {
      return iy.a(ki.s, new ajh($$0), new cts<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
