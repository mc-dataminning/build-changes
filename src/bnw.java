import com.mojang.serialization.Codec;

public interface bnw<P extends bnv> {
   bnw<bns> a = a("constant", bns.b);
   bnw<bob> b = a("uniform", bob.a);
   bnw<bnn> c = a("biased_to_bottom", bnn.a);
   bnw<bno> d = a("clamped", bno.a);
   bnw<boc> e = a("weighted_list", boc.a);
   bnw<bnq> f = a("clamped_normal", bnq.a);

   Codec<P> codec();

   static <P extends bnv> bnw<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.M, $$0, () -> $$1);
   }
}
