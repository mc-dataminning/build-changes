import com.mojang.serialization.Codec;

public interface eau<P extends eas> {
   Codec<eas> a = jy.ai.q().dispatch("processor_type", eas::a, eau::codec);
   Codec<eat> b = a.listOf().xmap(eat::new, eat::a);
   Codec<eat> c = asq.e(b.fieldOf("processors").codec(), b);
   Codec<ib<eat>> d = agc.a(jz.aC, c);
   eau<dzx> e = a("block_ignore", dzx.a);
   eau<dzz> f = a("block_rot", dzz.a);
   eau<eac> g = a("gravity", eac.a);
   eau<ead> h = a("jigsaw_replacement", ead.a);
   eau<eao> i = a("rule", eao.a);
   eau<eag> j = a("nop", eag.a);
   eau<dzw> k = a("block_age", dzw.a);
   eau<dzv> l = a("blackstone_replace", dzv.a);
   eau<eae> m = a("lava_submerged_block", eae.a);
   eau<eal> n = a("protected_blocks", eal.b);
   eau<eab> o = a("capped", eab.a);

   Codec<P> codec();

   static <P extends eas> eau<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.ai, $$0, () -> $$1);
   }
}
