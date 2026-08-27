import com.mojang.serialization.Codec;

public interface bnl<P extends bnk> {
   bnl<bnh> a = a("constant", bnh.b);
   bnl<bnq> b = a("uniform", bnq.a);
   bnl<bnc> c = a("biased_to_bottom", bnc.a);
   bnl<bnd> d = a("clamped", bnd.a);
   bnl<bnr> e = a("weighted_list", bnr.a);
   bnl<bnf> f = a("clamped_normal", bnf.a);

   Codec<P> codec();

   static <P extends bnk> bnl<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.M, $$0, () -> $$1);
   }
}
