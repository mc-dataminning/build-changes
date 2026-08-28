public interface dav<T extends dap<?>> {
   dav<daf> a = a("crafting");
   dav<dbg> b = a("smelting");
   dav<czz> c = a("blasting");
   dav<dbl> d = a("smoking");
   dav<dab> e = a("campfire_cooking");
   dav<dbm> f = a("stonecutting");
   dav<dbh> g = a("smithing");

   static <T extends dap<?>> dav<T> a(final String $$0) {
      return kd.a(ly.q, ali.b($$0), new dav<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
