import com.mojang.serialization.MapCodec;

public interface bse<P extends bsd> {
   bse<bsa> a = a("constant", bsa.b);
   bse<bsj> b = a("uniform", bsj.a);
   bse<brv> c = a("biased_to_bottom", brv.a);
   bse<brw> d = a("clamped", brw.a);
   bse<bsk> e = a("weighted_list", bsk.a);
   bse<bry> f = a("clamped_normal", bry.a);

   MapCodec<P> codec();

   static <P extends bsd> bse<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.K, $$0, () -> $$1);
   }
}
