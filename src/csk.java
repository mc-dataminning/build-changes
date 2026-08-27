public interface csk<T extends csf<?>> {
   csk<crw> a = a("crafting");
   csk<csu> b = a("smelting");
   csk<crr> c = a("blasting");
   csk<csy> d = a("smoking");
   csk<crt> e = a("campfire_cooking");
   csk<csz> f = a("stonecutting");
   csk<csv> g = a("smithing");

   static <T extends csf<?>> csk<T> a(final String $$0) {
      return iv.a(kf.s, new aiy($$0), new csk<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
