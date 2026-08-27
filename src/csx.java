public interface csx<T extends css<?>> {
   csx<csj> a = a("crafting");
   csx<cth> b = a("smelting");
   csx<cse> c = a("blasting");
   csx<ctl> d = a("smoking");
   csx<csg> e = a("campfire_cooking");
   csx<ctm> f = a("stonecutting");
   csx<cti> g = a("smithing");

   static <T extends css<?>> csx<T> a(final String $$0) {
      return ix.a(kh.s, new ajc($$0), new csx<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
