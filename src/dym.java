import com.mojang.serialization.Codec;

public interface dym<P extends dyl> {
   dym<dxp> a = a("always_true", dxp.a);
   dym<dxu> b = a("block_match", dxu.a);
   dym<dxw> c = a("blockstate_match", dxw.a);
   dym<dyt> d = a("tag_match", dyt.a);
   dym<dyi> e = a("random_block_match", dyi.a);
   dym<dyj> f = a("random_blockstate_match", dyj.a);

   Codec<P> codec();

   static <P extends dyl> dym<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.p, $$0, () -> $$1);
   }
}
