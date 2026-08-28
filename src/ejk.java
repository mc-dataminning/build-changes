import com.mojang.serialization.MapCodec;

public interface ejk<P extends ejj> {
   ejk<eji> a = a("constant", eji.b);
   ejk<ejm> b = a("uniform", ejm.a);
   ejk<ejh> c = a("biased_to_bottom", ejh.a);
   ejk<ejn> d = a("very_biased_to_bottom", ejn.a);
   ejk<ejl> e = a("trapezoid", ejl.a);
   ejk<ejo> f = a("weighted_list", ejo.a);

   MapCodec<P> codec();

   private static <P extends ejj> ejk<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.L, $$0, () -> $$1);
   }
}
