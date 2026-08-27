import com.mojang.serialization.Codec;

public interface ecy<P extends ecw> {
   Codec<ecw> a = kd.ah.q().dispatch("processor_type", ecw::a, ecy::codec);
   Codec<ecx> b = a.listOf().xmap(ecx::new, ecx::a);
   Codec<ecx> c = atq.e(b.fieldOf("processors").codec(), b);
   Codec<ih<ecx>> d = agz.a(ke.aE, c);
   ecy<ecb> e = a("block_ignore", ecb.a);
   ecy<ecd> f = a("block_rot", ecd.a);
   ecy<ecg> g = a("gravity", ecg.a);
   ecy<ech> h = a("jigsaw_replacement", ech.a);
   ecy<ecs> i = a("rule", ecs.a);
   ecy<eck> j = a("nop", eck.a);
   ecy<eca> k = a("block_age", eca.a);
   ecy<ebz> l = a("blackstone_replace", ebz.a);
   ecy<eci> m = a("lava_submerged_block", eci.a);
   ecy<ecp> n = a("protected_blocks", ecp.b);
   ecy<ecf> o = a("capped", ecf.a);

   Codec<P> codec();

   static <P extends ecw> ecy<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.ah, $$0, () -> $$1);
   }
}
