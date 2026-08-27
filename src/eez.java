import com.mojang.serialization.Codec;

public interface eez<P extends eey> {
   eez<eec> a = a("always_true", eec.a);
   eez<eeh> b = a("block_match", eeh.a);
   eez<eej> c = a("blockstate_match", eej.a);
   eez<efg> d = a("tag_match", efg.a);
   eez<eev> e = a("random_block_match", eev.a);
   eez<eew> f = a("random_blockstate_match", eew.a);

   Codec<P> codec();

   static <P extends eey> eez<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.o, $$0, () -> $$1);
   }
}
