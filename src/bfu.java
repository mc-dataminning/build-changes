import com.mojang.serialization.Codec;

public interface bfu<P extends bft> {
   bfu<bfq> a = a("constant", bfq.b);
   bfu<bfz> b = a("uniform", bfz.a);
   bfu<bfl> c = a("biased_to_bottom", bfl.a);
   bfu<bfm> d = a("clamped", bfm.a);
   bfu<bga> e = a("weighted_list", bga.a);
   bfu<bfo> f = a("clamped_normal", bfo.a);

   Codec<P> codec();

   static <P extends bft> bfu<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.N, $$0, () -> $$1);
   }
}
