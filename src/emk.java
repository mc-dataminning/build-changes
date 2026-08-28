import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface emk<P extends emi> {
   Codec<emi> a = lp.ah.q().dispatch("processor_type", emi::a, emk::codec);
   Codec<emj> b = a.listOf().xmap(emj::new, emj::a);
   Codec<emj> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<ji<emj>> d = alb.a(lq.aK, c);
   emk<eln> e = a("block_ignore", eln.a);
   emk<elp> f = a("block_rot", elp.a);
   emk<els> g = a("gravity", els.a);
   emk<elt> h = a("jigsaw_replacement", elt.a);
   emk<eme> i = a("rule", eme.a);
   emk<elw> j = a("nop", elw.a);
   emk<elm> k = a("block_age", elm.a);
   emk<ell> l = a("blackstone_replace", ell.a);
   emk<elu> m = a("lava_submerged_block", elu.a);
   emk<emb> n = a("protected_blocks", emb.b);
   emk<elr> o = a("capped", elr.a);

   MapCodec<P> codec();

   static <P extends emi> emk<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.ah, $$0, () -> $$1);
   }
}
