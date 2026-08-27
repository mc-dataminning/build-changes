import com.mojang.serialization.Codec;

public interface edf<P extends edd> {
   Codec<edd> a = kd.ah.q().dispatch("processor_type", edd::a, edf::codec);
   Codec<ede> b = a.listOf().xmap(ede::new, ede::a);
   Codec<ede> c = atw.e(b.fieldOf("processors").codec(), b);
   Codec<ih<ede>> d = ahc.a(ke.aE, c);
   edf<eci> e = a("block_ignore", eci.a);
   edf<eck> f = a("block_rot", eck.a);
   edf<ecn> g = a("gravity", ecn.a);
   edf<eco> h = a("jigsaw_replacement", eco.a);
   edf<ecz> i = a("rule", ecz.a);
   edf<ecr> j = a("nop", ecr.a);
   edf<ech> k = a("block_age", ech.a);
   edf<ecg> l = a("blackstone_replace", ecg.a);
   edf<ecp> m = a("lava_submerged_block", ecp.a);
   edf<ecw> n = a("protected_blocks", ecw.b);
   edf<ecm> o = a("capped", ecm.a);

   Codec<P> codec();

   static <P extends edd> edf<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.ah, $$0, () -> $$1);
   }
}
