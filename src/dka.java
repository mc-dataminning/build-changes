import com.mojang.serialization.Codec;

public interface dka<T extends djz> {
   dka<djr> a = a("block", new djr.a());
   dka<djt> b = a("entity", new djt.a());

   T b(sq var1);

   void a(sq var1, T var2);

   Codec<T> a();

   static <S extends dka<T>, T extends djz> S a(String $$0, S $$1) {
      return ht.a(jd.w, $$0, $$1);
   }

   static djz c(sq $$0) {
      aey $$1 = $$0.s();
      return jd.w.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1)).b($$0);
   }

   static <T extends djz> void a(T $$0, sq $$1) {
      $$1.a(jd.w.b($$0.a()));
      ((dka<T>)$$0.a()).a($$1, $$0);
   }
}
