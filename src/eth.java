import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface eth<P extends etf> {
   Codec<etf> a = md.af.q().dispatch("processor_type", etf::a, eth::codec);
   Codec<etg> b = a.listOf().xmap(etg::new, etg::a);
   Codec<etg> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<js<etg>> d = akz.a(me.ba, c);
   eth<esj> e = a("block_ignore", esj.a);
   eth<esl> f = a("block_rot", esl.a);
   eth<eso> g = a("gravity", eso.a);
   eth<esp> h = a("jigsaw_replacement", esp.a);
   eth<etb> i = a("rule", etb.a);
   eth<est> j = a("nop", est.a);
   eth<esi> k = a("block_age", esi.a);
   eth<esh> l = a("blackstone_replace", esh.a);
   eth<esq> m = a("lava_submerged_block", esq.a);
   eth<esy> n = a("protected_blocks", esy.b);
   eth<esn> o = a("capped", esn.a);

   MapCodec<P> codec();

   static <P extends etf> eth<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.af, $$0, () -> $$1);
   }
}
