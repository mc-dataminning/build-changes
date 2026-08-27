import com.mojang.serialization.Codec;

public interface egz<P extends egy> {
   egz<egc> a = a("always_true", egc.a);
   egz<egh> b = a("block_match", egh.a);
   egz<egj> c = a("blockstate_match", egj.a);
   egz<ehg> d = a("tag_match", ehg.a);
   egz<egv> e = a("random_block_match", egv.a);
   egz<egw> f = a("random_blockstate_match", egw.a);

   Codec<P> codec();

   static <P extends egy> egz<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.o, $$0, () -> $$1);
   }
}
