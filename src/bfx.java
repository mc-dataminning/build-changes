import com.mojang.serialization.Codec;

public interface bfx<P extends bfw> {
   bfx<bfu> a = a("constant", bfu.b);
   bfx<bgd> b = a("uniform", bgd.a);
   bfx<bfs> c = a("clamped_normal", bfs.a);
   bfx<bgc> d = a("trapezoid", bgc.a);

   Codec<P> codec();

   static <P extends bfw> bfx<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.M, $$0, () -> $$1);
   }
}
