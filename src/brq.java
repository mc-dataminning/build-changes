import com.mojang.serialization.MapCodec;

public interface brq<P extends brp> {
   brq<brm> a = a("constant", brm.b);
   brq<brv> b = a("uniform", brv.a);
   brq<brh> c = a("biased_to_bottom", brh.a);
   brq<bri> d = a("clamped", bri.a);
   brq<brw> e = a("weighted_list", brw.a);
   brq<brk> f = a("clamped_normal", brk.a);

   MapCodec<P> codec();

   static <P extends brp> brq<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.K, $$0, () -> $$1);
   }
}
