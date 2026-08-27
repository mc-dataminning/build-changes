import com.mojang.serialization.Codec;

public interface bmh<P extends bmg> {
   bmh<bme> a = a("constant", bme.b);
   bmh<bmn> b = a("uniform", bmn.a);
   bmh<bmc> c = a("clamped_normal", bmc.a);
   bmh<bmm> d = a("trapezoid", bmm.a);

   Codec<P> codec();

   static <P extends bmg> bmh<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.L, $$0, () -> $$1);
   }
}
