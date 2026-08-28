import com.mojang.serialization.MapCodec;

public interface epy<P extends epx> {
   epy<epa> a = a("always_true", epa.a);
   epy<epf> b = a("block_match", epf.a);
   epy<eph> c = a("blockstate_match", eph.a);
   epy<eqf> d = a("tag_match", eqf.a);
   epy<epu> e = a("random_block_match", epu.a);
   epy<epv> f = a("random_blockstate_match", epv.a);

   MapCodec<P> codec();

   static <P extends epx> epy<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.m, $$0, () -> $$1);
   }
}
