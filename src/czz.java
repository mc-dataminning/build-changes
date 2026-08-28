public interface czz<T extends czt<?>> {
   czz<czj> a = a("crafting");
   czz<dak> b = a("smelting");
   czz<czd> c = a("blasting");
   czz<dap> d = a("smoking");
   czz<czf> e = a("campfire_cooking");
   czz<daq> f = a("stonecutting");
   czz<dal> g = a("smithing");

   static <T extends czt<?>> czz<T> a(final String $$0) {
      return ka.a(lu.q, alb.b($$0), new czz<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
