import com.mojang.serialization.MapCodec;

public interface bse<P extends bsd> {
   bse<bsb> a = a("constant", bsb.b);
   bse<bsk> b = a("uniform", bsk.a);
   bse<brz> c = a("clamped_normal", brz.a);
   bse<bsj> d = a("trapezoid", bsj.a);

   MapCodec<P> codec();

   static <P extends bsd> bse<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.J, $$0, () -> $$1);
   }
}
