import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface evc<P extends eva> {
   Codec<eva> a = mf.af.q().dispatch("processor_type", eva::a, evc::codec);
   Codec<evb> b = a.listOf().xmap(evb::new, evb::a);
   Codec<evb> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<je<evb>> d = alc.a(mg.bc, c);
   evc<eue> e = a("block_ignore", eue.a);
   evc<eug> f = a("block_rot", eug.a);
   evc<euj> g = a("gravity", euj.a);
   evc<euk> h = a("jigsaw_replacement", euk.a);
   evc<euw> i = a("rule", euw.a);
   evc<euo> j = a("nop", euo.a);
   evc<eud> k = a("block_age", eud.a);
   evc<euc> l = a("blackstone_replace", euc.a);
   evc<eul> m = a("lava_submerged_block", eul.a);
   evc<eut> n = a("protected_blocks", eut.b);
   evc<eui> o = a("capped", eui.a);

   MapCodec<P> codec();

   static <P extends eva> evc<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.af, $$0, () -> $$1);
   }
}
