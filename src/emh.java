import com.mojang.serialization.MapCodec;

public interface emh<P extends emg> {
   emh<elk> a = a("always_true", elk.a);
   emh<elp> b = a("block_match", elp.a);
   emh<elr> c = a("blockstate_match", elr.a);
   emh<emo> d = a("tag_match", emo.a);
   emh<emd> e = a("random_block_match", emd.a);
   emh<eme> f = a("random_blockstate_match", eme.a);

   MapCodec<P> codec();

   static <P extends emg> emh<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.o, $$0, () -> $$1);
   }
}
