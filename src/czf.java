public interface czf<T extends cza<?>> {
   czf<cyp> a = a("crafting");
   czf<czp> b = a("smelting");
   czf<cyk> c = a("blasting");
   czf<czt> d = a("smoking");
   czf<cym> e = a("campfire_cooking");
   czf<czu> f = a("stonecutting");
   czf<czq> g = a("smithing");
   czf<cyy> h = a("poisonous_potato_cutting");
   czf<cyz> i = a("potato_refinement");

   static <T extends cza<?>> czf<T> a(final String $$0) {
      return jn.a(lh.s, new akt($$0), new czf<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
