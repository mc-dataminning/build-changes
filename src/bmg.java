import com.mojang.serialization.Codec;

public interface bmg<P extends bmf> {
   bmg<bmd> a = a("constant", bmd.b);
   bmg<bmm> b = a("uniform", bmm.a);
   bmg<bmb> c = a("clamped_normal", bmb.a);
   bmg<bml> d = a("trapezoid", bml.a);

   Codec<P> codec();

   static <P extends bmf> bmg<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.L, $$0, () -> $$1);
   }
}
