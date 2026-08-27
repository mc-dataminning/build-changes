import com.mojang.serialization.Codec;

public interface dyu<P extends dys> {
   Codec<dys> a = jb.ai.q().dispatch("processor_type", dys::a, dyu::codec);
   Codec<dyt> b = a.listOf().xmap(dyt::new, dyt::a);
   Codec<dyt> c = arj.e(b.fieldOf("processors").codec(), b);
   Codec<he<dyt>> d = aev.a(jc.aB, c);
   dyu<dxx> e = a("block_ignore", dxx.a);
   dyu<dxz> f = a("block_rot", dxz.a);
   dyu<dyc> g = a("gravity", dyc.a);
   dyu<dyd> h = a("jigsaw_replacement", dyd.a);
   dyu<dyo> i = a("rule", dyo.a);
   dyu<dyg> j = a("nop", dyg.a);
   dyu<dxw> k = a("block_age", dxw.a);
   dyu<dxv> l = a("blackstone_replace", dxv.a);
   dyu<dye> m = a("lava_submerged_block", dye.a);
   dyu<dyl> n = a("protected_blocks", dyl.b);
   dyu<dyb> o = a("capped", dyb.a);

   Codec<P> codec();

   static <P extends dys> dyu<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.ai, $$0, () -> $$1);
   }
}
