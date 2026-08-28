import com.mojang.serialization.MapCodec;

public interface btj<P extends bti> {
   btj<btf> a = a("constant", btf.b);
   btj<bto> b = a("uniform", bto.a);
   btj<bta> c = a("biased_to_bottom", bta.a);
   btj<btb> d = a("clamped", btb.a);
   btj<btp> e = a("weighted_list", btp.a);
   btj<btd> f = a("clamped_normal", btd.a);

   MapCodec<P> codec();

   static <P extends bti> btj<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.K, $$0, () -> $$1);
   }
}
