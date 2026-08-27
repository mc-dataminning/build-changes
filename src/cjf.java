public interface cjf<T extends cjc<?>> {
   cjf<cit> a = a("crafting");
   cjf<cjo> b = a("smelting");
   cjf<cio> c = a("blasting");
   cjf<cjs> d = a("smoking");
   cjf<ciq> e = a("campfire_cooking");
   cjf<cjt> f = a("stonecutting");
   cjf<cjp> g = a("smithing");

   static <T extends cjc<?>> cjf<T> a(final String $$0) {
      return hr.a(jb.t, new acq($$0), new cjf<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
