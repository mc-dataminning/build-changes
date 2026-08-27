import com.mojang.serialization.Codec;

public interface bos<P extends bor> {
   bos<boo> a = a("constant", boo.b);
   bos<box> b = a("uniform", box.a);
   bos<boj> c = a("biased_to_bottom", boj.a);
   bos<bok> d = a("clamped", bok.a);
   bos<boy> e = a("weighted_list", boy.a);
   bos<bom> f = a("clamped_normal", bom.a);

   Codec<P> codec();

   static <P extends bor> bos<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.M, $$0, () -> $$1);
   }
}
