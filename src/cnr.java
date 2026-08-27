public interface cnr<T extends cnn<?>> {
   cnr<cnd> a = a("crafting");
   cnr<coa> b = a("smelting");
   cnr<cmy> c = a("blasting");
   cnr<coe> d = a("smoking");
   cnr<cna> e = a("campfire_cooking");
   cnr<cof> f = a("stonecutting");
   cnr<cob> g = a("smithing");

   static <T extends cnn<?>> cnr<T> a(final String $$0) {
      return io.a(jy.t, new afw($$0), new cnr<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
