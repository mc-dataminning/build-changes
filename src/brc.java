import com.mojang.serialization.MapCodec;

public interface brc<P extends brb> {
   brc<bqz> a = a("constant", bqz.b);
   brc<bri> b = a("uniform", bri.a);
   brc<bqx> c = a("clamped_normal", bqx.a);
   brc<brh> d = a("trapezoid", brh.a);

   MapCodec<P> codec();

   static <P extends brb> brc<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.J, $$0, () -> $$1);
   }
}
