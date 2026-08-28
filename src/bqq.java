import com.mojang.serialization.MapCodec;

public interface bqq<P extends bqp> {
   bqq<bqm> a = a("constant", bqm.b);
   bqq<bqv> b = a("uniform", bqv.a);
   bqq<bqh> c = a("biased_to_bottom", bqh.a);
   bqq<bqi> d = a("clamped", bqi.a);
   bqq<bqw> e = a("weighted_list", bqw.a);
   bqq<bqk> f = a("clamped_normal", bqk.a);

   MapCodec<P> codec();

   static <P extends bqp> bqq<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.K, $$0, () -> $$1);
   }
}
