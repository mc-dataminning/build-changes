import com.mojang.serialization.Codec;

public interface edn<P extends edl> {
   Codec<edl> a = kd.ah.q().dispatch("processor_type", edl::a, edn::codec);
   Codec<edm> b = a.listOf().xmap(edm::new, edm::a);
   Codec<edm> c = atx.e(b.fieldOf("processors").codec(), b);
   Codec<ih<edm>> d = ahd.a(ke.aE, c);
   edn<ecq> e = a("block_ignore", ecq.a);
   edn<ecs> f = a("block_rot", ecs.a);
   edn<ecv> g = a("gravity", ecv.a);
   edn<ecw> h = a("jigsaw_replacement", ecw.a);
   edn<edh> i = a("rule", edh.a);
   edn<ecz> j = a("nop", ecz.a);
   edn<ecp> k = a("block_age", ecp.a);
   edn<eco> l = a("blackstone_replace", eco.a);
   edn<ecx> m = a("lava_submerged_block", ecx.a);
   edn<ede> n = a("protected_blocks", ede.b);
   edn<ecu> o = a("capped", ecu.a);

   Codec<P> codec();

   static <P extends edl> edn<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.ah, $$0, () -> $$1);
   }
}
