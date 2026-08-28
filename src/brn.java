import com.mojang.serialization.MapCodec;

public interface brn<P extends brm> {
   brn<brk> a = a("constant", brk.b);
   brn<brt> b = a("uniform", brt.a);
   brn<bri> c = a("clamped_normal", bri.a);
   brn<brs> d = a("trapezoid", brs.a);

   MapCodec<P> codec();

   static <P extends brm> brn<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.J, $$0, () -> $$1);
   }
}
