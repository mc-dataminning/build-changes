public interface cqp<T extends cqk<?>> {
   cqp<cqb> a = a("crafting");
   cqp<cqz> b = a("smelting");
   cqp<cpw> c = a("blasting");
   cqp<crd> d = a("smoking");
   cqp<cpy> e = a("campfire_cooking");
   cqp<cre> f = a("stonecutting");
   cqp<cra> g = a("smithing");

   static <T extends cqk<?>> cqp<T> a(final String $$0) {
      return it.a(kd.s, new ahh($$0), new cqp<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
