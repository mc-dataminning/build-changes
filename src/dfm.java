public interface dfm<T extends dfb<?>> {
   dfm<deq> a = a("crafting");
   dfm<dfv> b = a("smelting");
   dfm<dek> c = a("blasting");
   dfm<dga> d = a("smoking");
   dfm<dem> e = a("campfire_cooking");
   dfm<dgb> f = a("stonecutting");
   dfm<dfw> g = a("smithing");

   static <T extends dfb<?>> dfm<T> a(final String $$0) {
      return jt.a(mh.q, alr.b($$0), new dfm<T>() {
         @Override
         public String toString() {
            return $$0;
         }
      });
   }
}
