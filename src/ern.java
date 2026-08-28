import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ern<P extends erl> {
   Codec<erl> a = mb.af.q().dispatch("processor_type", erl::a, ern::codec);
   Codec<erm> b = a.listOf().xmap(erm::new, erm::a);
   Codec<erm> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jr<erm>> d = akr.a(mc.aV, c);
   ern<eqp> e = a("block_ignore", eqp.a);
   ern<eqr> f = a("block_rot", eqr.a);
   ern<equ> g = a("gravity", equ.a);
   ern<eqv> h = a("jigsaw_replacement", eqv.a);
   ern<erh> i = a("rule", erh.a);
   ern<eqz> j = a("nop", eqz.a);
   ern<eqo> k = a("block_age", eqo.a);
   ern<eqn> l = a("blackstone_replace", eqn.a);
   ern<eqw> m = a("lava_submerged_block", eqw.a);
   ern<ere> n = a("protected_blocks", ere.b);
   ern<eqt> o = a("capped", eqt.a);

   MapCodec<P> codec();

   static <P extends erl> ern<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.af, $$0, () -> $$1);
   }
}
