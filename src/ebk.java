import com.mojang.serialization.Codec;

public interface ebk<P extends ebj> {
   ebk<ebi> a = a("constant", ebi.b);
   ebk<ebm> b = a("uniform", ebm.a);
   ebk<ebh> c = a("biased_to_bottom", ebh.a);
   ebk<ebn> d = a("very_biased_to_bottom", ebn.a);
   ebk<ebl> e = a("trapezoid", ebl.a);
   ebk<ebo> f = a("weighted_list", ebo.a);

   Codec<P> codec();

   private static <P extends ebj> ebk<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.N, $$0, () -> $$1);
   }
}
