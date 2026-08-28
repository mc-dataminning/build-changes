import com.mojang.serialization.MapCodec;

public interface bqa<P extends bpz> {
   bqa<bpw> a = a("constant", bpw.b);
   bqa<bqf> b = a("uniform", bqf.a);
   bqa<bpr> c = a("biased_to_bottom", bpr.a);
   bqa<bps> d = a("clamped", bps.a);
   bqa<bqg> e = a("weighted_list", bqg.a);
   bqa<bpu> f = a("clamped_normal", bpu.a);

   MapCodec<P> codec();

   static <P extends bpz> bqa<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.M, $$0, () -> $$1);
   }
}
