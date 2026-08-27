public interface cmn<T extends cmj<?>> {
   cmn<clz> a = a("crafting");
   cmn<cmw> b = a("smelting");
   cmn<clu> c = a("blasting");
   cmn<cna> d = a("smoking");
   cmn<clw> e = a("campfire_cooking");
   cmn<cnb> f = a("stonecutting");
   cmn<cmx> g = a("smithing");

   static <T extends cmj<?>> cmn<T> a(final String $$0) {
      return hq.a(jb.t, new aew($$0), new cmn<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
