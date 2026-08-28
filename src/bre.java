import com.mojang.serialization.MapCodec;

public interface bre<P extends brd> {
   bre<bra> a = a("constant", bra.b);
   bre<brj> b = a("uniform", brj.a);
   bre<bqv> c = a("biased_to_bottom", bqv.a);
   bre<bqw> d = a("clamped", bqw.a);
   bre<brk> e = a("weighted_list", brk.a);
   bre<bqy> f = a("clamped_normal", bqy.a);

   MapCodec<P> codec();

   static <P extends brd> bre<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.K, $$0, () -> $$1);
   }
}
