import com.mojang.serialization.Codec;

public interface dyr<P extends dyp> {
   Codec<dyp> a = jb.ah.q().dispatch("processor_type", dyp::a, dyr::codec);
   Codec<dyq> b = a.listOf().xmap(dyq::new, dyq::a);
   Codec<dyq> c = aqy.c(b.fieldOf("processors").codec(), b);
   Codec<he<dyq>> d = aen.a(jc.aA, c);
   dyr<dxu> e = a("block_ignore", dxu.a);
   dyr<dxw> f = a("block_rot", dxw.a);
   dyr<dxz> g = a("gravity", dxz.a);
   dyr<dya> h = a("jigsaw_replacement", dya.a);
   dyr<dyl> i = a("rule", dyl.a);
   dyr<dyd> j = a("nop", dyd.a);
   dyr<dxt> k = a("block_age", dxt.a);
   dyr<dxs> l = a("blackstone_replace", dxs.a);
   dyr<dyb> m = a("lava_submerged_block", dyb.a);
   dyr<dyi> n = a("protected_blocks", dyi.b);
   dyr<dxy> o = a("capped", dxy.a);

   Codec<P> codec();

   static <P extends dyp> dyr<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.ah, $$0, () -> $$1);
   }
}
