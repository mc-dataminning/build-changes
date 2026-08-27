public interface cpq<T extends cpl<?>> {
   cpq<cpc> a = a("crafting");
   cpq<cqa> b = a("smelting");
   cpq<cox> c = a("blasting");
   cpq<cqe> d = a("smoking");
   cpq<coz> e = a("campfire_cooking");
   cpq<cqf> f = a("stonecutting");
   cpq<cqb> g = a("smithing");

   static <T extends cpl<?>> cpq<T> a(final String $$0) {
      return ir.a(kb.s, new agt($$0), new cpq<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
