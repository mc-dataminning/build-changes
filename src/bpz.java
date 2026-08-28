import com.mojang.serialization.MapCodec;

public interface bpz<P extends bpy> {
   bpz<bpv> a = a("constant", bpv.b);
   bpz<bqe> b = a("uniform", bqe.a);
   bpz<bpq> c = a("biased_to_bottom", bpq.a);
   bpz<bpr> d = a("clamped", bpr.a);
   bpz<bqf> e = a("weighted_list", bqf.a);
   bpz<bpt> f = a("clamped_normal", bpt.a);

   MapCodec<P> codec();

   static <P extends bpy> bpz<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.M, $$0, () -> $$1);
   }
}
