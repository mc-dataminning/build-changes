import com.mojang.serialization.MapCodec;

public interface bpx<P extends bpw> {
   bpx<bpt> a = a("constant", bpt.b);
   bpx<bqc> b = a("uniform", bqc.a);
   bpx<bpo> c = a("biased_to_bottom", bpo.a);
   bpx<bpp> d = a("clamped", bpp.a);
   bpx<bqd> e = a("weighted_list", bqd.a);
   bpx<bpr> f = a("clamped_normal", bpr.a);

   MapCodec<P> codec();

   static <P extends bpw> bpx<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.K, $$0, () -> $$1);
   }
}
