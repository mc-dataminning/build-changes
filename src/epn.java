import com.mojang.serialization.MapCodec;

public interface epn<P extends epm> {
   epn<epk> a = a("clear", epk.a);
   epn<epl> b = a("passthrough", epl.b);
   epn<epj> c = a("append_static", epj.a);
   epn<epi> d = a("append_loot", epi.a);

   MapCodec<P> codec();

   private static <P extends epm> epn<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.n, $$0, () -> $$1);
   }
}
