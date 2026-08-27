public interface cqh<T extends cqc<?>> {
   cqh<cpt> a = a("crafting");
   cqh<cqr> b = a("smelting");
   cqh<cpo> c = a("blasting");
   cqh<cqv> d = a("smoking");
   cqh<cpq> e = a("campfire_cooking");
   cqh<cqw> f = a("stonecutting");
   cqh<cqs> g = a("smithing");

   static <T extends cqc<?>> cqh<T> a(final String $$0) {
      return it.a(kd.s, new ahg($$0), new cqh<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
