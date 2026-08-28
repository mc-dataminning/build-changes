import com.mojang.serialization.MapCodec;

public interface emg<P extends emf> {
   emg<elj> a = a("always_true", elj.a);
   emg<elo> b = a("block_match", elo.a);
   emg<elq> c = a("blockstate_match", elq.a);
   emg<emn> d = a("tag_match", emn.a);
   emg<emc> e = a("random_block_match", emc.a);
   emg<emd> f = a("random_blockstate_match", emd.a);

   MapCodec<P> codec();

   static <P extends emf> emg<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.o, $$0, () -> $$1);
   }
}
