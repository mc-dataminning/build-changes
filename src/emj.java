import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface emj<P extends emh> {
   Codec<emh> a = lp.ah.q().dispatch("processor_type", emh::a, emj::codec);
   Codec<emi> b = a.listOf().xmap(emi::new, emi::a);
   Codec<emi> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<ji<emi>> d = alb.a(lq.aK, c);
   emj<elm> e = a("block_ignore", elm.a);
   emj<elo> f = a("block_rot", elo.a);
   emj<elr> g = a("gravity", elr.a);
   emj<els> h = a("jigsaw_replacement", els.a);
   emj<emd> i = a("rule", emd.a);
   emj<elv> j = a("nop", elv.a);
   emj<ell> k = a("block_age", ell.a);
   emj<elk> l = a("blackstone_replace", elk.a);
   emj<elt> m = a("lava_submerged_block", elt.a);
   emj<ema> n = a("protected_blocks", ema.b);
   emj<elq> o = a("capped", elq.a);

   MapCodec<P> codec();

   static <P extends emh> emj<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.ah, $$0, () -> $$1);
   }
}
