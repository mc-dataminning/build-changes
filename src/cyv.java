public interface cyv<T extends cyq<?>> {
   cyv<cyh> a = a("crafting");
   cyv<czf> b = a("smelting");
   cyv<cyc> c = a("blasting");
   cyv<czj> d = a("smoking");
   cyv<cye> e = a("campfire_cooking");
   cyv<czk> f = a("stonecutting");
   cyv<czg> g = a("smithing");

   static <T extends cyq<?>> cyv<T> a(final String $$0) {
      return jv.a(lp.s, new alb($$0), new cyv<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
