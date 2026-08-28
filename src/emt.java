import com.mojang.serialization.MapCodec;

public interface emt<P extends ems> {
   emt<elw> a = a("always_true", elw.a);
   emt<emb> b = a("block_match", emb.a);
   emt<emd> c = a("blockstate_match", emd.a);
   emt<ena> d = a("tag_match", ena.a);
   emt<emp> e = a("random_block_match", emp.a);
   emt<emq> f = a("random_blockstate_match", emq.a);

   MapCodec<P> codec();

   static <P extends ems> emt<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.m, $$0, () -> $$1);
   }
}
