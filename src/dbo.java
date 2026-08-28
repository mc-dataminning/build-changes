public interface dbo<T extends dbd<?>> {
   dbo<das> a = a("crafting");
   dbo<dbx> b = a("smelting");
   dbo<dam> c = a("blasting");
   dbo<dcc> d = a("smoking");
   dbo<dao> e = a("campfire_cooking");
   dbo<dcd> f = a("stonecutting");
   dbo<dby> g = a("smithing");

   static <T extends dbd<?>> dbo<T> a(final String $$0) {
      return ke.a(mb.q, akv.b($$0), new dbo<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
