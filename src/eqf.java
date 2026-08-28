import com.mojang.serialization.MapCodec;

public interface eqf<P extends eqe> {
   eqf<eph> a = a("always_true", eph.a);
   eqf<epm> b = a("block_match", epm.a);
   eqf<epo> c = a("blockstate_match", epo.a);
   eqf<eqm> d = a("tag_match", eqm.a);
   eqf<eqb> e = a("random_block_match", eqb.a);
   eqf<eqc> f = a("random_blockstate_match", eqc.a);

   MapCodec<P> codec();

   static <P extends eqe> eqf<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.m, $$0, () -> $$1);
   }
}
