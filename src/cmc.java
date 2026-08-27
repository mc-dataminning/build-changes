public interface cmc<T extends clz<?>> {
   cmc<clq> a = a("crafting");
   cmc<cml> b = a("smelting");
   cmc<cll> c = a("blasting");
   cmc<cmp> d = a("smoking");
   cmc<cln> e = a("campfire_cooking");
   cmc<cmq> f = a("stonecutting");
   cmc<cmm> g = a("smithing");

   static <T extends clz<?>> cmc<T> a(final String $$0) {
      return hs.a(jc.t, new aep($$0), new cmc<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
