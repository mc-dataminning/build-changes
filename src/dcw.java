public interface dcw<T extends dcl<?>> {
   dcw<dca> a = a("crafting");
   dcw<ddf> b = a("smelting");
   dcw<dbu> c = a("blasting");
   dcw<ddk> d = a("smoking");
   dcw<dbw> e = a("campfire_cooking");
   dcw<ddl> f = a("stonecutting");
   dcw<ddg> g = a("smithing");

   static <T extends dcl<?>> dcw<T> a(final String $$0) {
      return kf.a(md.q, ald.b($$0), new dcw<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
