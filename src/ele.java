import com.mojang.serialization.MapCodec;

public interface ele<P extends eld> {
   ele<ekh> a = a("always_true", ekh.a);
   ele<ekm> b = a("block_match", ekm.a);
   ele<eko> c = a("blockstate_match", eko.a);
   ele<ell> d = a("tag_match", ell.a);
   ele<ela> e = a("random_block_match", ela.a);
   ele<elb> f = a("random_blockstate_match", elb.a);

   MapCodec<P> codec();

   static <P extends eld> ele<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.o, $$0, () -> $$1);
   }
}
