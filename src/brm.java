import com.mojang.serialization.MapCodec;

public interface brm<P extends brl> {
   brm<brj> a = a("constant", brj.b);
   brm<brs> b = a("uniform", brs.a);
   brm<brh> c = a("clamped_normal", brh.a);
   brm<brr> d = a("trapezoid", brr.a);

   MapCodec<P> codec();

   static <P extends brl> brm<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.J, $$0, () -> $$1);
   }
}
