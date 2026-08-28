import com.mojang.serialization.MapCodec;

public interface bpm<P extends bpl> {
   bpm<bpi> a = a("constant", bpi.b);
   bpm<bpr> b = a("uniform", bpr.a);
   bpm<bpd> c = a("biased_to_bottom", bpd.a);
   bpm<bpe> d = a("clamped", bpe.a);
   bpm<bps> e = a("weighted_list", bps.a);
   bpm<bpg> f = a("clamped_normal", bpg.a);

   MapCodec<P> codec();

   static <P extends bpl> bpm<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.K, $$0, () -> $$1);
   }
}
