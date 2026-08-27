import com.mojang.serialization.Codec;

public interface dqg<P extends dqf> {
   dqg<dql> a = a("matching_blocks", dql.a);
   dqg<dqk> b = a("matching_block_tag", dqk.e);
   dqg<dqm> c = a("matching_fluids", dqm.a);
   dqg<dqi> d = a("has_sturdy_face", dqi.a);
   dqg<dqp> e = a("solid", dqp.a);
   dqg<dqo> f = a("replaceable", dqo.a);
   dqg<dqs> g = a("would_survive", dqs.a);
   dqg<dqj> h = a("inside_world_bounds", dqj.a);
   dqg<dqe> i = a("any_of", dqe.a);
   dqg<dqd> j = a("all_of", dqd.a);
   dqg<dqn> k = a("not", dqn.a);
   dqg<dqr> l = a("true", dqr.e);

   Codec<P> codec();

   private static <P extends dqf> dqg<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.O, $$0, () -> $$1);
   }
}
