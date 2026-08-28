import com.mojang.serialization.MapCodec;

public interface bpj<P extends bpi> {
   bpj<bpf> a = a("constant", bpf.b);
   bpj<bpo> b = a("uniform", bpo.a);
   bpj<bpa> c = a("biased_to_bottom", bpa.a);
   bpj<bpb> d = a("clamped", bpb.a);
   bpj<bpp> e = a("weighted_list", bpp.a);
   bpj<bpd> f = a("clamped_normal", bpd.a);

   MapCodec<P> codec();

   static <P extends bpi> bpj<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.K, $$0, () -> $$1);
   }
}
