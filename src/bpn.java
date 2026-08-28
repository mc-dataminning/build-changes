import com.mojang.serialization.MapCodec;

public interface bpn<P extends bpm> {
   bpn<bpj> a = a("constant", bpj.b);
   bpn<bps> b = a("uniform", bps.a);
   bpn<bpe> c = a("biased_to_bottom", bpe.a);
   bpn<bpf> d = a("clamped", bpf.a);
   bpn<bpt> e = a("weighted_list", bpt.a);
   bpn<bph> f = a("clamped_normal", bph.a);

   MapCodec<P> codec();

   static <P extends bpm> bpn<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.K, $$0, () -> $$1);
   }
}
