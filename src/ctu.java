public interface ctu<T extends ctp<?>> {
   ctu<ctg> a = a("crafting");
   ctu<cue> b = a("smelting");
   ctu<ctb> c = a("blasting");
   ctu<cui> d = a("smoking");
   ctu<ctd> e = a("campfire_cooking");
   ctu<cuj> f = a("stonecutting");
   ctu<cuf> g = a("smithing");

   static <T extends ctp<?>> ctu<T> a(final String $$0) {
      return iy.a(ki.s, new ajh($$0), new ctu<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
