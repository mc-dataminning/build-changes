public interface cyb<T extends cxw<?>> {
   cyb<cxn> a = a("crafting");
   cyb<cyl> b = a("smelting");
   cyb<cxi> c = a("blasting");
   cyb<cyp> d = a("smoking");
   cyb<cxk> e = a("campfire_cooking");
   cyb<cyq> f = a("stonecutting");
   cyb<cym> g = a("smithing");

   static <T extends cxw<?>> cyb<T> a(final String $$0) {
      return jk.a(le.s, new akn($$0), new cyb<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
