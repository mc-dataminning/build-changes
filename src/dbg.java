public interface dbg<T extends dba<?>> {
   dbg<daq> a = a("crafting");
   dbg<dbq> b = a("smelting");
   dbg<dak> c = a("blasting");
   dbg<dbv> d = a("smoking");
   dbg<dam> e = a("campfire_cooking");
   dbg<dbw> f = a("stonecutting");
   dbg<dbr> g = a("smithing");

   static <T extends dba<?>> dbg<T> a(final String $$0) {
      return kd.a(lz.q, alj.b($$0), new dbg<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
