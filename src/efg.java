import com.mojang.serialization.Codec;

public interface efg<P extends eff> {
   efg<eej> a = a("always_true", eej.a);
   efg<eeo> b = a("block_match", eeo.a);
   efg<eeq> c = a("blockstate_match", eeq.a);
   efg<efn> d = a("tag_match", efn.a);
   efg<efc> e = a("random_block_match", efc.a);
   efg<efd> f = a("random_blockstate_match", efd.a);

   Codec<P> codec();

   static <P extends eff> efg<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.o, $$0, () -> $$1);
   }
}
