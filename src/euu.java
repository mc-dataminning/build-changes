import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface euu<P extends eus> {
   Codec<eus> a = mf.af.q().dispatch("processor_type", eus::a, euu::codec);
   Codec<eut> b = a.listOf().xmap(eut::new, eut::a);
   Codec<eut> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<je<eut>> d = alc.a(mg.bb, c);
   euu<etw> e = a("block_ignore", etw.a);
   euu<ety> f = a("block_rot", ety.a);
   euu<eub> g = a("gravity", eub.a);
   euu<euc> h = a("jigsaw_replacement", euc.a);
   euu<euo> i = a("rule", euo.a);
   euu<eug> j = a("nop", eug.a);
   euu<etv> k = a("block_age", etv.a);
   euu<etu> l = a("blackstone_replace", etu.a);
   euu<eud> m = a("lava_submerged_block", eud.a);
   euu<eul> n = a("protected_blocks", eul.b);
   euu<eua> o = a("capped", eua.a);

   MapCodec<P> codec();

   static <P extends eus> euu<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.af, $$0, () -> $$1);
   }
}
