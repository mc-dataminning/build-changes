import com.mojang.serialization.MapCodec;

public interface brl<P extends brk> {
   brl<bri> a = a("constant", bri.b);
   brl<brr> b = a("uniform", brr.a);
   brl<brg> c = a("clamped_normal", brg.a);
   brl<brq> d = a("trapezoid", brq.a);

   MapCodec<P> codec();

   static <P extends brk> brl<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.J, $$0, () -> $$1);
   }
}
