import com.mojang.serialization.Codec;

public interface djs<T extends djr> {
   djs<djj> a = a("block", new djj.a());
   djs<djl> b = a("entity", new djl.a());

   T b(so var1);

   void a(so var1, T var2);

   Codec<T> a();

   static <S extends djs<T>, T extends djr> S a(String $$0, S $$1) {
      return hq.a(jb.w, $$0, $$1);
   }

   static djr c(so $$0) {
      aez $$1 = $$0.t();
      return jb.w.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1)).b($$0);
   }

   static <T extends djr> void a(T $$0, so $$1) {
      $$1.a(jb.w.b($$0.a()));
      ((djs<T>)$$0.a()).a($$1, $$0);
   }
}
