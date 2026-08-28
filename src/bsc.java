import com.mojang.serialization.MapCodec;

public interface bsc<P extends bsb> {
   bsc<brz> a = a("constant", brz.b);
   bsc<bsi> b = a("uniform", bsi.a);
   bsc<brx> c = a("clamped_normal", brx.a);
   bsc<bsh> d = a("trapezoid", bsh.a);

   MapCodec<P> codec();

   static <P extends bsb> bsc<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.J, $$0, () -> $$1);
   }
}
