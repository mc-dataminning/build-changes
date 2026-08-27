import com.mojang.serialization.Codec;

public interface dkq<T extends dkp> {
   dkq<dkh> a = a("block", new dkh.a());
   dkq<dkj> b = a("entity", new dkj.a());

   T b(tl var1);

   void a(tl var1, T var2);

   Codec<T> a();

   static <S extends dkq<T>, T extends dkp> S a(String $$0, S $$1) {
      return io.a(jy.w, $$0, $$1);
   }

   static dkp c(tl $$0) {
      afw $$1 = $$0.t();
      return jy.w.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1)).b($$0);
   }

   static <T extends dkp> void a(T $$0, tl $$1) {
      $$1.a(jy.w.b($$0.a()));
      ((dkq<T>)$$0.a()).a($$1, $$0);
   }
}
