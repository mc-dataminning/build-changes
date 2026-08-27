public interface cmt<T extends cmp<?>> {
   cmt<cmf> a = a("crafting");
   cmt<cnc> b = a("smelting");
   cmt<cma> c = a("blasting");
   cmt<cng> d = a("smoking");
   cmt<cmc> e = a("campfire_cooking");
   cmt<cnh> f = a("stonecutting");
   cmt<cnd> g = a("smithing");

   static <T extends cmp<?>> cmt<T> a(final String $$0) {
      return hq.a(jb.t, new aez($$0), new cmt<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
