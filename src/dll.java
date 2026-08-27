import com.mojang.serialization.Codec;

public interface dll<T extends dlk> {
   dll<dlc> a = a("block", new dlc.a());
   dll<dle> b = a("entity", new dle.a());

   T b(tu var1);

   void a(tu var1, T var2);

   Codec<T> a();

   static <S extends dll<T>, T extends dlk> S a(String $$0, S $$1) {
      return io.a(jy.w, $$0, $$1);
   }

   static dlk c(tu $$0) {
      agg $$1 = $$0.t();
      return jy.w.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown position source type " + $$1)).b($$0);
   }

   static <T extends dlk> void a(T $$0, tu $$1) {
      $$1.a(jy.w.b($$0.a()));
      ((dll<T>)$$0.a()).a($$1, $$0);
   }
}
