import com.mojang.serialization.MapCodec;

public interface bsp<P extends bso> {
   bsp<bsl> a = a("constant", bsl.b);
   bsp<bsu> b = a("uniform", bsu.a);
   bsp<bsg> c = a("biased_to_bottom", bsg.a);
   bsp<bsh> d = a("clamped", bsh.a);
   bsp<bsv> e = a("weighted_list", bsv.a);
   bsp<bsj> f = a("clamped_normal", bsj.a);

   MapCodec<P> codec();

   static <P extends bso> bsp<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.K, $$0, () -> $$1);
   }
}
