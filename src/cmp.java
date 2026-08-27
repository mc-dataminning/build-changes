public interface cmp<T extends cml<?>> {
   cmp<cmb> a = a("crafting");
   cmp<cmy> b = a("smelting");
   cmp<clw> c = a("blasting");
   cmp<cnc> d = a("smoking");
   cmp<cly> e = a("campfire_cooking");
   cmp<cnd> f = a("stonecutting");
   cmp<cmz> g = a("smithing");

   static <T extends cml<?>> cmp<T> a(final String $$0) {
      return ht.a(jd.t, new aey($$0), new cmp<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
