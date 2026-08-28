import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface erm<P extends erk> {
   Codec<erk> a = mb.af.q().dispatch("processor_type", erk::a, erm::codec);
   Codec<erl> b = a.listOf().xmap(erl::new, erl::a);
   Codec<erl> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jr<erl>> d = akr.a(mc.aV, c);
   erm<eqo> e = a("block_ignore", eqo.a);
   erm<eqq> f = a("block_rot", eqq.a);
   erm<eqt> g = a("gravity", eqt.a);
   erm<equ> h = a("jigsaw_replacement", equ.a);
   erm<erg> i = a("rule", erg.a);
   erm<eqy> j = a("nop", eqy.a);
   erm<eqn> k = a("block_age", eqn.a);
   erm<eqm> l = a("blackstone_replace", eqm.a);
   erm<eqv> m = a("lava_submerged_block", eqv.a);
   erm<erd> n = a("protected_blocks", erd.b);
   erm<eqs> o = a("capped", eqs.a);

   MapCodec<P> codec();

   static <P extends erk> erm<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.af, $$0, () -> $$1);
   }
}
