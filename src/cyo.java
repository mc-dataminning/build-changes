public interface cyo<T extends cyi<?>> {
   cyo<cxz> a = a("crafting");
   cyo<cyz> b = a("smelting");
   cyo<cxt> c = a("blasting");
   cyo<cze> d = a("smoking");
   cyo<cxv> e = a("campfire_cooking");
   cyo<czf> f = a("stonecutting");
   cyo<cza> g = a("smithing");

   static <T extends cyi<?>> cyo<T> a(final String $$0) {
      return jw.a(lq.q, new akk($$0), new cyo<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
