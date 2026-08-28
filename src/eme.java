import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface eme<P extends emc> {
   Codec<emc> a = lp.ah.q().dispatch("processor_type", emc::a, eme::codec);
   Codec<emd> b = a.listOf().xmap(emd::new, emd::a);
   Codec<emd> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<ji<emd>> d = akx.a(lq.aK, c);
   eme<elh> e = a("block_ignore", elh.a);
   eme<elj> f = a("block_rot", elj.a);
   eme<elm> g = a("gravity", elm.a);
   eme<eln> h = a("jigsaw_replacement", eln.a);
   eme<ely> i = a("rule", ely.a);
   eme<elq> j = a("nop", elq.a);
   eme<elg> k = a("block_age", elg.a);
   eme<elf> l = a("blackstone_replace", elf.a);
   eme<elo> m = a("lava_submerged_block", elo.a);
   eme<elv> n = a("protected_blocks", elv.b);
   eme<ell> o = a("capped", ell.a);

   MapCodec<P> codec();

   static <P extends emc> eme<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.ah, $$0, () -> $$1);
   }
}
