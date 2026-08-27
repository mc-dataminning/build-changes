import com.mojang.serialization.Codec;

public interface dyw<P extends dyv> {
   dyw<dxz> a = a("always_true", dxz.a);
   dyw<dye> b = a("block_match", dye.a);
   dyw<dyg> c = a("blockstate_match", dyg.a);
   dyw<dzd> d = a("tag_match", dzd.a);
   dyw<dys> e = a("random_block_match", dys.a);
   dyw<dyt> f = a("random_blockstate_match", dyt.a);

   Codec<P> codec();

   static <P extends dyv> dyw<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.p, $$0, () -> $$1);
   }
}
