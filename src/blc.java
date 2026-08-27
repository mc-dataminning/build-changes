import com.mojang.serialization.Codec;

public interface blc<P extends blb> {
   blc<bky> a = a("constant", bky.b);
   blc<blh> b = a("uniform", blh.a);
   blc<bkt> c = a("biased_to_bottom", bkt.a);
   blc<bku> d = a("clamped", bku.a);
   blc<bli> e = a("weighted_list", bli.a);
   blc<bkw> f = a("clamped_normal", bkw.a);

   Codec<P> codec();

   static <P extends blb> blc<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.M, $$0, () -> $$1);
   }
}
