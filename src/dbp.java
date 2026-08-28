public interface dbp<T extends dbe<?>> {
   dbp<dat> a = a("crafting");
   dbp<dby> b = a("smelting");
   dbp<dan> c = a("blasting");
   dbp<dcd> d = a("smoking");
   dbp<dap> e = a("campfire_cooking");
   dbp<dce> f = a("stonecutting");
   dbp<dbz> g = a("smithing");

   static <T extends dbe<?>> dbp<T> a(final String $$0) {
      return ke.a(mb.q, akv.b($$0), new dbp<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
