import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface eml<P extends emj> {
   Codec<emj> a = lp.ah.q().dispatch("processor_type", emj::a, eml::codec);
   Codec<emk> b = a.listOf().xmap(emk::new, emk::a);
   Codec<emk> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<ji<emk>> d = alb.a(lq.aK, c);
   eml<elo> e = a("block_ignore", elo.a);
   eml<elq> f = a("block_rot", elq.a);
   eml<elt> g = a("gravity", elt.a);
   eml<elu> h = a("jigsaw_replacement", elu.a);
   eml<emf> i = a("rule", emf.a);
   eml<elx> j = a("nop", elx.a);
   eml<eln> k = a("block_age", eln.a);
   eml<elm> l = a("blackstone_replace", elm.a);
   eml<elv> m = a("lava_submerged_block", elv.a);
   eml<emc> n = a("protected_blocks", emc.b);
   eml<els> o = a("capped", els.a);

   MapCodec<P> codec();

   static <P extends emj> eml<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.ah, $$0, () -> $$1);
   }
}
