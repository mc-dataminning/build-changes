import com.mojang.serialization.Codec;

public interface bmi<P extends bmh> {
   bmi<bme> a = a("constant", bme.b);
   bmi<bmn> b = a("uniform", bmn.a);
   bmi<blz> c = a("biased_to_bottom", blz.a);
   bmi<bma> d = a("clamped", bma.a);
   bmi<bmo> e = a("weighted_list", bmo.a);
   bmi<bmc> f = a("clamped_normal", bmc.a);

   Codec<P> codec();

   static <P extends bmh> bmi<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.M, $$0, () -> $$1);
   }
}
