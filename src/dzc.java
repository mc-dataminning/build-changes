import com.mojang.serialization.Codec;

public interface dzc<P extends dza> {
   Codec<dza> a = jd.ah.q().dispatch("processor_type", dza::a, dzc::codec);
   Codec<dzb> b = a.listOf().xmap(dzb::new, dzb::a);
   Codec<dzb> c = arh.e(b.fieldOf("processors").codec(), b);
   Codec<hg<dzb>> d = aeu.a(je.aA, c);
   dzc<dyf> e = a("block_ignore", dyf.a);
   dzc<dyh> f = a("block_rot", dyh.a);
   dzc<dyk> g = a("gravity", dyk.a);
   dzc<dyl> h = a("jigsaw_replacement", dyl.a);
   dzc<dyw> i = a("rule", dyw.a);
   dzc<dyo> j = a("nop", dyo.a);
   dzc<dye> k = a("block_age", dye.a);
   dzc<dyd> l = a("blackstone_replace", dyd.a);
   dzc<dym> m = a("lava_submerged_block", dym.a);
   dzc<dyt> n = a("protected_blocks", dyt.b);
   dzc<dyj> o = a("capped", dyj.a);

   Codec<P> codec();

   static <P extends dza> dzc<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.ah, $$0, () -> $$1);
   }
}
