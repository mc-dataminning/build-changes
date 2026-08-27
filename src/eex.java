import com.mojang.serialization.Codec;

public interface eex<P extends eew> {
   eex<eev> a = a("constant", eev.b);
   eex<eez> b = a("uniform", eez.a);
   eex<eeu> c = a("biased_to_bottom", eeu.a);
   eex<efa> d = a("very_biased_to_bottom", efa.a);
   eex<eey> e = a("trapezoid", eey.a);
   eex<efb> f = a("weighted_list", efb.a);

   Codec<P> codec();

   private static <P extends eew> eex<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.N, $$0, () -> $$1);
   }
}
