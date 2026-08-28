import com.mojang.serialization.MapCodec;

public interface bsk<P extends bsj> {
   bsk<bsg> a = a("constant", bsg.b);
   bsk<bsp> b = a("uniform", bsp.a);
   bsk<bsb> c = a("biased_to_bottom", bsb.a);
   bsk<bsc> d = a("clamped", bsc.a);
   bsk<bsq> e = a("weighted_list", bsq.a);
   bsk<bse> f = a("clamped_normal", bse.a);

   MapCodec<P> codec();

   static <P extends bsj> bsk<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.K, $$0, () -> $$1);
   }
}
