import com.mojang.serialization.Codec;

public interface bfu<P extends bft> {
   bfu<bfr> a = a("constant", bfr.b);
   bfu<bga> b = a("uniform", bga.a);
   bfu<bfp> c = a("clamped_normal", bfp.a);
   bfu<bfz> d = a("trapezoid", bfz.a);

   Codec<P> codec();

   static <P extends bft> bfu<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.M, $$0, () -> $$1);
   }
}
