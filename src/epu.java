import com.mojang.serialization.MapCodec;

public interface epu<P extends ept> {
   epu<eow> a = a("always_true", eow.a);
   epu<epb> b = a("block_match", epb.a);
   epu<epd> c = a("blockstate_match", epd.a);
   epu<eqb> d = a("tag_match", eqb.a);
   epu<epq> e = a("random_block_match", epq.a);
   epu<epr> f = a("random_blockstate_match", epr.a);

   MapCodec<P> codec();

   static <P extends ept> epu<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.m, $$0, () -> $$1);
   }
}
