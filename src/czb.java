public interface czb<T extends cyw<?>> {
   czb<cyn> a = a("crafting");
   czb<czl> b = a("smelting");
   czb<cyi> c = a("blasting");
   czb<czp> d = a("smoking");
   czb<cyk> e = a("campfire_cooking");
   czb<czq> f = a("stonecutting");
   czb<czm> g = a("smithing");

   static <T extends cyw<?>> czb<T> a(final String $$0) {
      return jv.a(lp.s, new alf($$0), new czb<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
