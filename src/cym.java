public interface cym<T extends cyg<?>> {
   cym<cxx> a = a("crafting");
   cym<cyx> b = a("smelting");
   cym<cxr> c = a("blasting");
   cym<czc> d = a("smoking");
   cym<cxt> e = a("campfire_cooking");
   cym<czd> f = a("stonecutting");
   cym<cyy> g = a("smithing");

   static <T extends cyg<?>> cym<T> a(final String $$0) {
      return jw.a(lq.q, new akk($$0), new cym<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
