import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ero<P extends erm> {
   Codec<erm> a = mb.af.q().dispatch("processor_type", erm::a, ero::codec);
   Codec<ern> b = a.listOf().xmap(ern::new, ern::a);
   Codec<ern> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jr<ern>> d = akr.a(mc.aV, c);
   ero<eqq> e = a("block_ignore", eqq.a);
   ero<eqs> f = a("block_rot", eqs.a);
   ero<eqv> g = a("gravity", eqv.a);
   ero<eqw> h = a("jigsaw_replacement", eqw.a);
   ero<eri> i = a("rule", eri.a);
   ero<era> j = a("nop", era.a);
   ero<eqp> k = a("block_age", eqp.a);
   ero<eqo> l = a("blackstone_replace", eqo.a);
   ero<eqx> m = a("lava_submerged_block", eqx.a);
   ero<erf> n = a("protected_blocks", erf.b);
   ero<equ> o = a("capped", equ.a);

   MapCodec<P> codec();

   static <P extends erm> ero<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.af, $$0, () -> $$1);
   }
}
