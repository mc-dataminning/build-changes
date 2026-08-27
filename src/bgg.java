import com.mojang.serialization.Codec;

public interface bgg<P extends bgf> {
   bgg<bgc> a = a("constant", bgc.b);
   bgg<bgl> b = a("uniform", bgl.a);
   bgg<bfx> c = a("biased_to_bottom", bfx.a);
   bgg<bfy> d = a("clamped", bfy.a);
   bgg<bgm> e = a("weighted_list", bgm.a);
   bgg<bga> f = a("clamped_normal", bga.a);

   Codec<P> codec();

   static <P extends bgf> bgg<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.N, $$0, () -> $$1);
   }
}
