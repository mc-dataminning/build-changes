import com.mojang.serialization.Codec;

public interface bhh<P extends bhg> {
   bhh<bhd> a = a("constant", bhd.b);
   bhh<bhm> b = a("uniform", bhm.a);
   bhh<bgy> c = a("biased_to_bottom", bgy.a);
   bhh<bgz> d = a("clamped", bgz.a);
   bhh<bhn> e = a("weighted_list", bhn.a);
   bhh<bhb> f = a("clamped_normal", bhb.a);

   Codec<P> codec();

   static <P extends bhg> bhh<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.N, $$0, () -> $$1);
   }
}
