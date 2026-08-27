public interface csg<T extends csb<?>> {
   csg<crs> a = a("crafting");
   csg<csq> b = a("smelting");
   csg<crn> c = a("blasting");
   csg<csu> d = a("smoking");
   csg<crp> e = a("campfire_cooking");
   csg<csv> f = a("stonecutting");
   csg<csr> g = a("smithing");

   static <T extends csb<?>> csg<T> a(final String $$0) {
      return iv.a(kf.s, new aiy($$0), new csg<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
