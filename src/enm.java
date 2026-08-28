import com.mojang.serialization.MapCodec;

public interface enm<P extends enl> {
   enm<emo> a = a("always_true", emo.a);
   enm<emt> b = a("block_match", emt.a);
   enm<emv> c = a("blockstate_match", emv.a);
   enm<ent> d = a("tag_match", ent.a);
   enm<eni> e = a("random_block_match", eni.a);
   enm<enj> f = a("random_blockstate_match", enj.a);

   MapCodec<P> codec();

   static <P extends enl> enm<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.m, $$0, () -> $$1);
   }
}
