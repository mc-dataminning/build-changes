import com.mojang.serialization.Codec;

public interface eia<P extends ehz> {
   eia<ehy> a = a("constant", ehy.b);
   eia<eic> b = a("uniform", eic.a);
   eia<ehx> c = a("biased_to_bottom", ehx.a);
   eia<eid> d = a("very_biased_to_bottom", eid.a);
   eia<eib> e = a("trapezoid", eib.a);
   eia<eie> f = a("weighted_list", eie.a);

   Codec<P> codec();

   private static <P extends ehz> eia<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.N, $$0, () -> $$1);
   }
}
