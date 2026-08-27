import com.mojang.serialization.Codec;

public interface eeo<P extends een> {
   eeo<eem> a = a("constant", eem.b);
   eeo<eeq> b = a("uniform", eeq.a);
   eeo<eel> c = a("biased_to_bottom", eel.a);
   eeo<eer> d = a("very_biased_to_bottom", eer.a);
   eeo<eep> e = a("trapezoid", eep.a);
   eeo<ees> f = a("weighted_list", ees.a);

   Codec<P> codec();

   private static <P extends een> eeo<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.N, $$0, () -> $$1);
   }
}
