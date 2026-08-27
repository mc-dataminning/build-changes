import com.mojang.serialization.Codec;

public interface ebg<P extends ebe> {
   Codec<ebe> a = jy.ai.q().dispatch("processor_type", ebe::a, ebg::codec);
   Codec<ebf> b = a.listOf().xmap(ebf::new, ebf::a);
   Codec<ebf> c = asu.e(b.fieldOf("processors").codec(), b);
   Codec<ib<ebf>> d = age.a(jz.aC, c);
   ebg<eaj> e = a("block_ignore", eaj.a);
   ebg<eal> f = a("block_rot", eal.a);
   ebg<eao> g = a("gravity", eao.a);
   ebg<eap> h = a("jigsaw_replacement", eap.a);
   ebg<eba> i = a("rule", eba.a);
   ebg<eas> j = a("nop", eas.a);
   ebg<eai> k = a("block_age", eai.a);
   ebg<eah> l = a("blackstone_replace", eah.a);
   ebg<eaq> m = a("lava_submerged_block", eaq.a);
   ebg<eax> n = a("protected_blocks", eax.b);
   ebg<ean> o = a("capped", ean.a);

   Codec<P> codec();

   static <P extends ebe> ebg<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.ai, $$0, () -> $$1);
   }
}
