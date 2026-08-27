import com.mojang.serialization.Codec;

public interface dza<P extends dyy> {
   Codec<dyy> a = jd.ah.q().dispatch("processor_type", dyy::a, dza::codec);
   Codec<dyz> b = a.listOf().xmap(dyz::new, dyz::a);
   Codec<dyz> c = arg.e(b.fieldOf("processors").codec(), b);
   Codec<hg<dyz>> d = aet.a(je.aA, c);
   dza<dyd> e = a("block_ignore", dyd.a);
   dza<dyf> f = a("block_rot", dyf.a);
   dza<dyi> g = a("gravity", dyi.a);
   dza<dyj> h = a("jigsaw_replacement", dyj.a);
   dza<dyu> i = a("rule", dyu.a);
   dza<dym> j = a("nop", dym.a);
   dza<dyc> k = a("block_age", dyc.a);
   dza<dyb> l = a("blackstone_replace", dyb.a);
   dza<dyk> m = a("lava_submerged_block", dyk.a);
   dza<dyr> n = a("protected_blocks", dyr.b);
   dza<dyh> o = a("capped", dyh.a);

   Codec<P> codec();

   static <P extends dyy> dza<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.ah, $$0, () -> $$1);
   }
}
