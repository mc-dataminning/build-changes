import com.mojang.serialization.Codec;

public interface bih<P extends big> {
   bih<bid> a = a("constant", bid.b);
   bih<bim> b = a("uniform", bim.a);
   bih<bhy> c = a("biased_to_bottom", bhy.a);
   bih<bhz> d = a("clamped", bhz.a);
   bih<bin> e = a("weighted_list", bin.a);
   bih<bib> f = a("clamped_normal", bib.a);

   Codec<P> codec();

   static <P extends big> bih<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.N, $$0, () -> $$1);
   }
}
