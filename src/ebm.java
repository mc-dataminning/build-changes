import com.mojang.serialization.Codec;

public interface ebm<P extends ebl> {
   ebm<ebk> a = a("constant", ebk.b);
   ebm<ebo> b = a("uniform", ebo.a);
   ebm<ebj> c = a("biased_to_bottom", ebj.a);
   ebm<ebp> d = a("very_biased_to_bottom", ebp.a);
   ebm<ebn> e = a("trapezoid", ebn.a);
   ebm<ebq> f = a("weighted_list", ebq.a);

   Codec<P> codec();

   private static <P extends ebl> ebm<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.N, $$0, () -> $$1);
   }
}
