import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface evj<P extends evh> {
   Codec<evh> a = mg.af.q().dispatch("processor_type", evh::a, evj::codec);
   Codec<evi> b = a.listOf().xmap(evi::new, evi::a);
   Codec<evi> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jf<evi>> d = alc.a(mh.bc, c);
   evj<eul> e = a("block_ignore", eul.a);
   evj<eun> f = a("block_rot", eun.a);
   evj<euq> g = a("gravity", euq.a);
   evj<eur> h = a("jigsaw_replacement", eur.a);
   evj<evd> i = a("rule", evd.a);
   evj<euv> j = a("nop", euv.a);
   evj<euk> k = a("block_age", euk.a);
   evj<euj> l = a("blackstone_replace", euj.a);
   evj<eus> m = a("lava_submerged_block", eus.a);
   evj<eva> n = a("protected_blocks", eva.b);
   evj<eup> o = a("capped", eup.a);

   MapCodec<P> codec();

   static <P extends evh> evj<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.af, $$0, () -> $$1);
   }
}
