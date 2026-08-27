import com.mojang.serialization.Codec;

public interface dyq<P extends dyo> {
   Codec<dyo> a = jb.ah.q().dispatch("processor_type", dyo::a, dyq::codec);
   Codec<dyp> b = a.listOf().xmap(dyp::new, dyp::a);
   Codec<dyp> c = aqy.c(b.fieldOf("processors").codec(), b);
   Codec<he<dyp>> d = aen.a(jc.aA, c);
   dyq<dxt> e = a("block_ignore", dxt.a);
   dyq<dxv> f = a("block_rot", dxv.a);
   dyq<dxy> g = a("gravity", dxy.a);
   dyq<dxz> h = a("jigsaw_replacement", dxz.a);
   dyq<dyk> i = a("rule", dyk.a);
   dyq<dyc> j = a("nop", dyc.a);
   dyq<dxs> k = a("block_age", dxs.a);
   dyq<dxr> l = a("blackstone_replace", dxr.a);
   dyq<dya> m = a("lava_submerged_block", dya.a);
   dyq<dyh> n = a("protected_blocks", dyh.b);
   dyq<dxx> o = a("capped", dxx.a);

   Codec<P> codec();

   static <P extends dyo> dyq<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.ah, $$0, () -> $$1);
   }
}
