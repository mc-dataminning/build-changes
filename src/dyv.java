import com.mojang.serialization.Codec;

public interface dyv<P extends dyt> {
   Codec<dyt> a = jd.ah.q().dispatch("processor_type", dyt::a, dyv::codec);
   Codec<dyu> b = a.listOf().xmap(dyu::new, dyu::a);
   Codec<dyu> c = arb.e(b.fieldOf("processors").codec(), b);
   Codec<hg<dyu>> d = aeq.a(je.aA, c);
   dyv<dxy> e = a("block_ignore", dxy.a);
   dyv<dya> f = a("block_rot", dya.a);
   dyv<dyd> g = a("gravity", dyd.a);
   dyv<dye> h = a("jigsaw_replacement", dye.a);
   dyv<dyp> i = a("rule", dyp.a);
   dyv<dyh> j = a("nop", dyh.a);
   dyv<dxx> k = a("block_age", dxx.a);
   dyv<dxw> l = a("blackstone_replace", dxw.a);
   dyv<dyf> m = a("lava_submerged_block", dyf.a);
   dyv<dym> n = a("protected_blocks", dym.b);
   dyv<dyc> o = a("capped", dyc.a);

   Codec<P> codec();

   static <P extends dyt> dyv<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.ah, $$0, () -> $$1);
   }
}
