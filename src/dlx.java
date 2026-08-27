import com.mojang.serialization.Codec;

public interface dlx<T extends dlw> {
   dlx<dlo> a = a("block", new dlo.a());
   dlx<dlq> b = a("entity", new dlq.a());

   T b(tu var1);

   void a(tu var1, T var2);

   Codec<T> a();

   static <S extends dlx<T>, T extends dlw> S a(String $$0, S $$1) {
      return io.a(jy.w, $$0, $$1);
   }

   static dlw c(tu $$0) {
      agi $$1 = $$0.t();
      return jy.w.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1)).b($$0);
   }

   static <T extends dlw> void a(T $$0, tu $$1) {
      $$1.a(jy.w.b($$0.a()));
      ((dlx<T>)$$0.a()).a($$1, $$0);
   }
}
