import com.mojang.serialization.MapCodec;

public interface bpw<P extends bpv> {
   bpw<bps> a = a("constant", bps.b);
   bpw<bqb> b = a("uniform", bqb.a);
   bpw<bpn> c = a("biased_to_bottom", bpn.a);
   bpw<bpo> d = a("clamped", bpo.a);
   bpw<bqc> e = a("weighted_list", bqc.a);
   bpw<bpq> f = a("clamped_normal", bpq.a);

   MapCodec<P> codec();

   static <P extends bpv> bpw<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.K, $$0, () -> $$1);
   }
}
