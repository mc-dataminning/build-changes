public interface cmd<T extends cma<?>> {
   cmd<clr> a = a("crafting");
   cmd<cmm> b = a("smelting");
   cmd<clm> c = a("blasting");
   cmd<cmq> d = a("smoking");
   cmd<clo> e = a("campfire_cooking");
   cmd<cmr> f = a("stonecutting");
   cmd<cmn> g = a("smithing");

   static <T extends cma<?>> cmd<T> a(final String $$0) {
      return hr.a(jb.t, new aer($$0), new cmd<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
