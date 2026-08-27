import com.mojang.serialization.Codec;

public interface dyr<P extends dyq> {
   dyr<dxu> a = a("always_true", dxu.a);
   dyr<dxz> b = a("block_match", dxz.a);
   dyr<dyb> c = a("blockstate_match", dyb.a);
   dyr<dyy> d = a("tag_match", dyy.a);
   dyr<dyn> e = a("random_block_match", dyn.a);
   dyr<dyo> f = a("random_blockstate_match", dyo.a);

   Codec<P> codec();

   static <P extends dyq> dyr<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.p, $$0, () -> $$1);
   }
}
