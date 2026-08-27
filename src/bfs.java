import com.mojang.serialization.Codec;

public interface bfs<P extends bfr> {
   bfs<bfp> a = a("constant", bfp.b);
   bfs<bfy> b = a("uniform", bfy.a);
   bfs<bfn> c = a("clamped_normal", bfn.a);
   bfs<bfx> d = a("trapezoid", bfx.a);

   Codec<P> codec();

   static <P extends bfr> bfs<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.M, $$0, () -> $$1);
   }
}
