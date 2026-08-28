public interface czc<T extends cyx<?>> {
   czc<cyo> a = a("crafting");
   czc<czm> b = a("smelting");
   czc<cyj> c = a("blasting");
   czc<czq> d = a("smoking");
   czc<cyl> e = a("campfire_cooking");
   czc<czr> f = a("stonecutting");
   czc<czn> g = a("smithing");

   static <T extends cyx<?>> czc<T> a(final String $$0) {
      return jv.a(lp.s, new alf($$0), new czc<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
