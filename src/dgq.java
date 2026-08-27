import com.mojang.serialization.Codec;

public interface dgq<T extends dgp> {
   dgq<dgh> a = a("block", new dgh.a());
   dgq<dgj> b = a("entity", new dgj.a());

   T b(sf var1);

   void a(sf var1, T var2);

   Codec<T> a();

   static <S extends dgq<T>, T extends dgp> S a(String $$0, S $$1) {
      return hr.a(jb.w, $$0, $$1);
   }

   static dgp c(sf $$0) {
      acq $$1 = $$0.t();
      return jb.w.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1)).b($$0);
   }

   static <T extends dgp> void a(T $$0, sf $$1) {
      $$1.a(jb.w.b($$0.a()));
      ((dgq<T>)$$0.a()).a($$1, $$0);
   }
}
