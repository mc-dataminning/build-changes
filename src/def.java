public interface def<T extends ddu<?>> {
   def<ddj> a = a("crafting");
   def<deo> b = a("smelting");
   def<ddd> c = a("blasting");
   def<det> d = a("smoking");
   def<ddf> e = a("campfire_cooking");
   def<deu> f = a("stonecutting");
   def<dep> g = a("smithing");

   static <T extends ddu<?>> def<T> a(final String $$0) {
      return jr.a(mf.q, alg.b($$0), new def<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
