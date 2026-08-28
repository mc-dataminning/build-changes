import com.mojang.serialization.MapCodec;

public interface emr<P extends emq> {
   emr<elu> a = a("always_true", elu.a);
   emr<elz> b = a("block_match", elz.a);
   emr<emb> c = a("blockstate_match", emb.a);
   emr<emy> d = a("tag_match", emy.a);
   emr<emn> e = a("random_block_match", emn.a);
   emr<emo> f = a("random_blockstate_match", emo.a);

   MapCodec<P> codec();

   static <P extends emq> emr<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.m, $$0, () -> $$1);
   }
}
