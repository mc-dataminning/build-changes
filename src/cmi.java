public interface cmi<T extends cme<?>> {
   cmi<clu> a = a("crafting");
   cmi<cmr> b = a("smelting");
   cmi<clp> c = a("blasting");
   cmi<cmv> d = a("smoking");
   cmi<clr> e = a("campfire_cooking");
   cmi<cmw> f = a("stonecutting");
   cmi<cms> g = a("smithing");

   static <T extends cme<?>> cmi<T> a(final String $$0) {
      return ht.a(jd.t, new aeu($$0), new cmi<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
