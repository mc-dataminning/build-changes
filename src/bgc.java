import com.mojang.serialization.Codec;

public interface bgc<P extends bgb> {
   bgc<bfz> a = a("constant", bfz.b);
   bgc<bgi> b = a("uniform", bgi.a);
   bgc<bfx> c = a("clamped_normal", bfx.a);
   bgc<bgh> d = a("trapezoid", bgh.a);

   Codec<P> codec();

   static <P extends bgb> bgc<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.M, $$0, () -> $$1);
   }
}
