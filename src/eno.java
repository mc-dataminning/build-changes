import com.mojang.serialization.MapCodec;

public interface eno<P extends enn> {
   eno<emq> a = a("always_true", emq.a);
   eno<emv> b = a("block_match", emv.a);
   eno<emx> c = a("blockstate_match", emx.a);
   eno<env> d = a("tag_match", env.a);
   eno<enk> e = a("random_block_match", enk.a);
   eno<enl> f = a("random_blockstate_match", enl.a);

   MapCodec<P> codec();

   static <P extends enn> eno<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.m, $$0, () -> $$1);
   }
}
