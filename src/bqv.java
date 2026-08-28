import com.mojang.serialization.MapCodec;

public interface bqv<P extends bqu> {
   bqv<bqr> a = a("constant", bqr.b);
   bqv<bra> b = a("uniform", bra.a);
   bqv<bqm> c = a("biased_to_bottom", bqm.a);
   bqv<bqn> d = a("clamped", bqn.a);
   bqv<brb> e = a("weighted_list", brb.a);
   bqv<bqp> f = a("clamped_normal", bqp.a);

   MapCodec<P> codec();

   static <P extends bqu> bqv<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.K, $$0, () -> $$1);
   }
}
