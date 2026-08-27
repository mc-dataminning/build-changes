import com.mojang.serialization.Codec;

public interface djt<T extends djs> {
   djt<djk> a = a("block", new djk.a());
   djt<djm> b = a("entity", new djm.a());

   T b(sl var1);

   void a(sl var1, T var2);

   Codec<T> a();

   static <S extends djt<T>, T extends djs> S a(String $$0, S $$1) {
      return ht.a(jd.w, $$0, $$1);
   }

   static djs c(sl $$0) {
      aeu $$1 = $$0.s();
      return jd.w.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1)).b($$0);
   }

   static <T extends djs> void a(T $$0, sl $$1) {
      $$1.a(jd.w.b($$0.a()));
      ((djt<T>)$$0.a()).a($$1, $$0);
   }
}
