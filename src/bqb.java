import com.mojang.serialization.MapCodec;

public interface bqb<P extends bqa> {
   bqb<bpx> a = a("constant", bpx.b);
   bqb<bqg> b = a("uniform", bqg.a);
   bqb<bps> c = a("biased_to_bottom", bps.a);
   bqb<bpt> d = a("clamped", bpt.a);
   bqb<bqh> e = a("weighted_list", bqh.a);
   bqb<bpv> f = a("clamped_normal", bpv.a);

   MapCodec<P> codec();

   static <P extends bqa> bqb<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.M, $$0, () -> $$1);
   }
}
