public interface cvx<T extends cvs<?>> {
   cvx<cvj> a = a("crafting");
   cvx<cwh> b = a("smelting");
   cvx<cve> c = a("blasting");
   cvx<cwl> d = a("smoking");
   cvx<cvg> e = a("campfire_cooking");
   cvx<cwm> f = a("stonecutting");
   cvx<cwi> g = a("smithing");

   static <T extends cvs<?>> cvx<T> a(final String $$0) {
      return ja.a(kt.s, new ajv($$0), new cvx<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
