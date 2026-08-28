import com.mojang.serialization.MapCodec;

public interface bpv<P extends bpu> {
   bpv<bpr> a = a("constant", bpr.b);
   bpv<bqa> b = a("uniform", bqa.a);
   bpv<bpm> c = a("biased_to_bottom", bpm.a);
   bpv<bpn> d = a("clamped", bpn.a);
   bpv<bqb> e = a("weighted_list", bqb.a);
   bpv<bpp> f = a("clamped_normal", bpp.a);

   MapCodec<P> codec();

   static <P extends bpu> bpv<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.M, $$0, () -> $$1);
   }
}
