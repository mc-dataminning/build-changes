import com.mojang.serialization.Codec;

public interface dtk<P extends dtj> {
   dtk<dti> a = a("constant", dti.b);
   dtk<dtm> b = a("uniform", dtm.a);
   dtk<dth> c = a("biased_to_bottom", dth.a);
   dtk<dtn> d = a("very_biased_to_bottom", dtn.a);
   dtk<dtl> e = a("trapezoid", dtl.a);
   dtk<dto> f = a("weighted_list", dto.a);

   Codec<P> codec();

   private static <P extends dtj> dtk<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.O, $$0, () -> $$1);
   }
}
