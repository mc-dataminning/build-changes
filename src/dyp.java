import com.mojang.serialization.Codec;

public interface dyp<P extends dyn> {
   Codec<dyn> a = jc.ah.q().dispatch("processor_type", dyn::a, dyp::codec);
   Codec<dyo> b = a.listOf().xmap(dyo::new, dyo::a);
   Codec<dyo> c = aqw.c(b.fieldOf("processors").codec(), b);
   Codec<hf<dyo>> d = ael.a(jd.aA, c);
   dyp<dxs> e = a("block_ignore", dxs.a);
   dyp<dxu> f = a("block_rot", dxu.a);
   dyp<dxx> g = a("gravity", dxx.a);
   dyp<dxy> h = a("jigsaw_replacement", dxy.a);
   dyp<dyj> i = a("rule", dyj.a);
   dyp<dyb> j = a("nop", dyb.a);
   dyp<dxr> k = a("block_age", dxr.a);
   dyp<dxq> l = a("blackstone_replace", dxq.a);
   dyp<dxz> m = a("lava_submerged_block", dxz.a);
   dyp<dyg> n = a("protected_blocks", dyg.b);
   dyp<dxw> o = a("capped", dxw.a);

   Codec<P> codec();

   static <P extends dyn> dyp<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.ah, $$0, () -> $$1);
   }
}
