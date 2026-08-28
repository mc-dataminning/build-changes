public interface dbn<T extends dbc<?>> {
   dbn<dar> a = a("crafting");
   dbn<dbw> b = a("smelting");
   dbn<dal> c = a("blasting");
   dbn<dcb> d = a("smoking");
   dbn<dan> e = a("campfire_cooking");
   dbn<dcc> f = a("stonecutting");
   dbn<dbx> g = a("smithing");

   static <T extends dbc<?>> dbn<T> a(final String $$0) {
      return ke.a(mb.q, aku.b($$0), new dbn<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
