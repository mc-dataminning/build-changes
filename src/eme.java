import com.mojang.serialization.MapCodec;

public interface eme<P extends emd> {
   eme<elh> a = a("always_true", elh.a);
   eme<elm> b = a("block_match", elm.a);
   eme<elo> c = a("blockstate_match", elo.a);
   eme<eml> d = a("tag_match", eml.a);
   eme<ema> e = a("random_block_match", ema.a);
   eme<emb> f = a("random_blockstate_match", emb.a);

   MapCodec<P> codec();

   static <P extends emd> eme<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.o, $$0, () -> $$1);
   }
}
