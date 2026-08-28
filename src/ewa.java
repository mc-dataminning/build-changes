import com.mojang.serialization.MapCodec;

public interface ewa<P extends evz> {
   ewa<evc> a = a("always_true", evc.a);
   ewa<evh> b = a("block_match", evh.a);
   ewa<evj> c = a("blockstate_match", evj.a);
   ewa<ewh> d = a("tag_match", ewh.a);
   ewa<evw> e = a("random_block_match", evw.a);
   ewa<evx> f = a("random_blockstate_match", evx.a);

   MapCodec<P> codec();

   static <P extends evz> ewa<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.m, $$0, () -> $$1);
   }
}
