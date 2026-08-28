import com.mojang.serialization.MapCodec;

public interface emf<P extends eme> {
   emf<eli> a = a("always_true", eli.a);
   emf<eln> b = a("block_match", eln.a);
   emf<elp> c = a("blockstate_match", elp.a);
   emf<emm> d = a("tag_match", emm.a);
   emf<emb> e = a("random_block_match", emb.a);
   emf<emc> f = a("random_blockstate_match", emc.a);

   MapCodec<P> codec();

   static <P extends eme> emf<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.o, $$0, () -> $$1);
   }
}
