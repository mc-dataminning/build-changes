import com.mojang.serialization.Codec;

public interface bng<P extends bnf> {
   bng<bnc> a = a("constant", bnc.b);
   bng<bnl> b = a("uniform", bnl.a);
   bng<bmx> c = a("biased_to_bottom", bmx.a);
   bng<bmy> d = a("clamped", bmy.a);
   bng<bnm> e = a("weighted_list", bnm.a);
   bng<bna> f = a("clamped_normal", bna.a);

   Codec<P> codec();

   static <P extends bnf> bng<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.M, $$0, () -> $$1);
   }
}
