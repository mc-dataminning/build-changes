public interface cqg<T extends cqb<?>> {
   cqg<cps> a = a("crafting");
   cqg<cqq> b = a("smelting");
   cqg<cpn> c = a("blasting");
   cqg<cqu> d = a("smoking");
   cqg<cpp> e = a("campfire_cooking");
   cqg<cqv> f = a("stonecutting");
   cqg<cqr> g = a("smithing");

   static <T extends cqb<?>> cqg<T> a(final String $$0) {
      return it.a(kd.s, new ahg($$0), new cqg<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
