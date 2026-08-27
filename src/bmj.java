import com.mojang.serialization.Codec;

public interface bmj<P extends bmi> {
   bmj<bmf> a = a("constant", bmf.b);
   bmj<bmo> b = a("uniform", bmo.a);
   bmj<bma> c = a("biased_to_bottom", bma.a);
   bmj<bmb> d = a("clamped", bmb.a);
   bmj<bmp> e = a("weighted_list", bmp.a);
   bmj<bmd> f = a("clamped_normal", bmd.a);

   Codec<P> codec();

   static <P extends bmi> bmj<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.M, $$0, () -> $$1);
   }
}
