import com.mojang.serialization.Codec;

public interface ede<P extends edc> {
   Codec<edc> a = kd.ah.q().dispatch("processor_type", edc::a, ede::codec);
   Codec<edd> b = a.listOf().xmap(edd::new, edd::a);
   Codec<edd> c = atv.e(b.fieldOf("processors").codec(), b);
   Codec<ih<edd>> d = ahc.a(ke.aE, c);
   ede<ech> e = a("block_ignore", ech.a);
   ede<ecj> f = a("block_rot", ecj.a);
   ede<ecm> g = a("gravity", ecm.a);
   ede<ecn> h = a("jigsaw_replacement", ecn.a);
   ede<ecy> i = a("rule", ecy.a);
   ede<ecq> j = a("nop", ecq.a);
   ede<ecg> k = a("block_age", ecg.a);
   ede<ecf> l = a("blackstone_replace", ecf.a);
   ede<eco> m = a("lava_submerged_block", eco.a);
   ede<ecv> n = a("protected_blocks", ecv.b);
   ede<ecl> o = a("capped", ecl.a);

   Codec<P> codec();

   static <P extends edc> ede<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.ah, $$0, () -> $$1);
   }
}
