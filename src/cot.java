public interface cot<T extends coo<?>> {
   cot<cod> a = a("crafting");
   cot<cpc> b = a("smelting");
   cot<cny> c = a("blasting");
   cot<cpg> d = a("smoking");
   cot<coa> e = a("campfire_cooking");
   cot<cph> f = a("stonecutting");
   cot<cpd> g = a("smithing");

   static <T extends coo<?>> cot<T> a(final String $$0) {
      return io.a(jy.t, new agi($$0), new cot<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
