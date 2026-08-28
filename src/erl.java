import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface erl<P extends erj> {
   Codec<erj> a = mb.af.q().dispatch("processor_type", erj::a, erl::codec);
   Codec<erk> b = a.listOf().xmap(erk::new, erk::a);
   Codec<erk> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jr<erk>> d = akq.a(mc.aV, c);
   erl<eqn> e = a("block_ignore", eqn.a);
   erl<eqp> f = a("block_rot", eqp.a);
   erl<eqs> g = a("gravity", eqs.a);
   erl<eqt> h = a("jigsaw_replacement", eqt.a);
   erl<erf> i = a("rule", erf.a);
   erl<eqx> j = a("nop", eqx.a);
   erl<eqm> k = a("block_age", eqm.a);
   erl<eql> l = a("blackstone_replace", eql.a);
   erl<equ> m = a("lava_submerged_block", equ.a);
   erl<erc> n = a("protected_blocks", erc.b);
   erl<eqr> o = a("capped", eqr.a);

   MapCodec<P> codec();

   static <P extends erj> erl<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.af, $$0, () -> $$1);
   }
}
