import com.mojang.serialization.Codec;

public interface dpx<P extends dpw> {
   dpx<dqc> a = a("matching_blocks", dqc.a);
   dpx<dqb> b = a("matching_block_tag", dqb.e);
   dpx<dqd> c = a("matching_fluids", dqd.a);
   dpx<dpz> d = a("has_sturdy_face", dpz.a);
   dpx<dqg> e = a("solid", dqg.a);
   dpx<dqf> f = a("replaceable", dqf.a);
   dpx<dqj> g = a("would_survive", dqj.a);
   dpx<dqa> h = a("inside_world_bounds", dqa.a);
   dpx<dpv> i = a("any_of", dpv.a);
   dpx<dpu> j = a("all_of", dpu.a);
   dpx<dqe> k = a("not", dqe.a);
   dpx<dqi> l = a("true", dqi.e);

   Codec<P> codec();

   private static <P extends dpw> dpx<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.O, $$0, () -> $$1);
   }
}
