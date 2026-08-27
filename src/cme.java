public interface cme<T extends cmb<?>> {
   cme<cls> a = a("crafting");
   cme<cmn> b = a("smelting");
   cme<cln> c = a("blasting");
   cme<cmr> d = a("smoking");
   cme<clp> e = a("campfire_cooking");
   cme<cms> f = a("stonecutting");
   cme<cmo> g = a("smithing");

   static <T extends cmb<?>> cme<T> a(final String $$0) {
      return hr.a(jb.t, new aer($$0), new cme<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
