public interface cqa<T extends cpv<?>> {
   cqa<cpm> a = a("crafting");
   cqa<cqk> b = a("smelting");
   cqa<cph> c = a("blasting");
   cqa<cqo> d = a("smoking");
   cqa<cpj> e = a("campfire_cooking");
   cqa<cqp> f = a("stonecutting");
   cqa<cql> g = a("smithing");

   static <T extends cpv<?>> cqa<T> a(final String $$0) {
      return it.a(kd.s, new ahd($$0), new cqa<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
