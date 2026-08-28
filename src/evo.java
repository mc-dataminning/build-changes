import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface evo<P extends evm> {
   Codec<evm> a = mg.af.q().dispatch("processor_type", evm::a, evo::codec);
   Codec<evn> b = a.listOf().xmap(evn::new, evn::a);
   Codec<evn> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jf<evn>> d = alc.a(mh.bc, c);
   evo<euq> e = a("block_ignore", euq.a);
   evo<eus> f = a("block_rot", eus.a);
   evo<euv> g = a("gravity", euv.a);
   evo<euw> h = a("jigsaw_replacement", euw.a);
   evo<evi> i = a("rule", evi.a);
   evo<eva> j = a("nop", eva.a);
   evo<eup> k = a("block_age", eup.a);
   evo<euo> l = a("blackstone_replace", euo.a);
   evo<eux> m = a("lava_submerged_block", eux.a);
   evo<evf> n = a("protected_blocks", evf.b);
   evo<euu> o = a("capped", euu.a);

   MapCodec<P> codec();

   static <P extends evm> evo<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.af, $$0, () -> $$1);
   }
}
