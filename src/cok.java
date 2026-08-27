public interface cok<T extends cof<?>> {
   cok<cnv> a = a("crafting");
   cok<cou> b = a("smelting");
   cok<cnq> c = a("blasting");
   cok<coy> d = a("smoking");
   cok<cns> e = a("campfire_cooking");
   cok<coz> f = a("stonecutting");
   cok<cov> g = a("smithing");

   static <T extends cof<?>> cok<T> a(final String $$0) {
      return io.a(jy.t, new agg($$0), new cok<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
