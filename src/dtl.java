import com.mojang.serialization.Codec;

public interface dtl<P extends dtk> {
   dtl<dtj> a = a("constant", dtj.b);
   dtl<dtn> b = a("uniform", dtn.a);
   dtl<dti> c = a("biased_to_bottom", dti.a);
   dtl<dto> d = a("very_biased_to_bottom", dto.a);
   dtl<dtm> e = a("trapezoid", dtm.a);
   dtl<dtp> f = a("weighted_list", dtp.a);

   Codec<P> codec();

   private static <P extends dtk> dtl<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.O, $$0, () -> $$1);
   }
}
