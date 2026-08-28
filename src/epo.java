import com.mojang.serialization.MapCodec;

public interface epo<P extends epn> {
   epo<eoq> a = a("always_true", eoq.a);
   epo<eov> b = a("block_match", eov.a);
   epo<eox> c = a("blockstate_match", eox.a);
   epo<epv> d = a("tag_match", epv.a);
   epo<epk> e = a("random_block_match", epk.a);
   epo<epl> f = a("random_blockstate_match", epl.a);

   MapCodec<P> codec();

   static <P extends epn> epo<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.m, $$0, () -> $$1);
   }
}
