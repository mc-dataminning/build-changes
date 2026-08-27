public interface cwl<T extends cwg<?>> {
   cwl<cvx> a = a("crafting");
   cwl<cwv> b = a("smelting");
   cwl<cvs> c = a("blasting");
   cwl<cwz> d = a("smoking");
   cwl<cvu> e = a("campfire_cooking");
   cwl<cxa> f = a("stonecutting");
   cwl<cww> g = a("smithing");

   static <T extends cwg<?>> cwl<T> a(final String $$0) {
      return ji.a(lc.s, new akf($$0), new cwl<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
