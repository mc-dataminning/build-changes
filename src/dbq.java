public interface dbq<T extends dbf<?>> {
   dbq<dau> a = a("crafting");
   dbq<dbz> b = a("smelting");
   dbq<dao> c = a("blasting");
   dbq<dce> d = a("smoking");
   dbq<daq> e = a("campfire_cooking");
   dbq<dcf> f = a("stonecutting");
   dbq<dca> g = a("smithing");

   static <T extends dbf<?>> dbq<T> a(final String $$0) {
      return ke.a(mb.q, akv.b($$0), new dbq<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
