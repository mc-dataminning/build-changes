public interface czd<T extends cyx<?>> {
   czd<cyo> a = a("crafting");
   czd<czo> b = a("smelting");
   czd<cyi> c = a("blasting");
   czd<czt> d = a("smoking");
   czd<cyk> e = a("campfire_cooking");
   czd<czu> f = a("stonecutting");
   czd<czp> g = a("smithing");

   static <T extends cyx<?>> czd<T> a(final String $$0) {
      return jz.a(lt.q, akq.b($$0), new czd<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
