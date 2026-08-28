import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface emh<P extends emf> {
   Codec<emf> a = lp.ah.q().dispatch("processor_type", emf::a, emh::codec);
   Codec<emg> b = a.listOf().xmap(emg::new, emg::a);
   Codec<emg> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<ji<emg>> d = ala.a(lq.aK, c);
   emh<elk> e = a("block_ignore", elk.a);
   emh<elm> f = a("block_rot", elm.a);
   emh<elp> g = a("gravity", elp.a);
   emh<elq> h = a("jigsaw_replacement", elq.a);
   emh<emb> i = a("rule", emb.a);
   emh<elt> j = a("nop", elt.a);
   emh<elj> k = a("block_age", elj.a);
   emh<eli> l = a("blackstone_replace", eli.a);
   emh<elr> m = a("lava_submerged_block", elr.a);
   emh<ely> n = a("protected_blocks", ely.b);
   emh<elo> o = a("capped", elo.a);

   MapCodec<P> codec();

   static <P extends emf> emh<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.ah, $$0, () -> $$1);
   }
}
