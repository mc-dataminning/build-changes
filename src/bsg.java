import com.mojang.serialization.MapCodec;

public interface bsg<P extends bsf> {
   bsg<bsc> a = a("constant", bsc.b);
   bsg<bsl> b = a("uniform", bsl.a);
   bsg<brx> c = a("biased_to_bottom", brx.a);
   bsg<bry> d = a("clamped", bry.a);
   bsg<bsm> e = a("weighted_list", bsm.a);
   bsg<bsa> f = a("clamped_normal", bsa.a);

   MapCodec<P> codec();

   static <P extends bsf> bsg<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.K, $$0, () -> $$1);
   }
}
