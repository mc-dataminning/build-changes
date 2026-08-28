import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ese<P extends esc> {
   Codec<esc> a = ma.af.q().dispatch("processor_type", esc::a, ese::codec);
   Codec<esd> b = a.listOf().xmap(esd::new, esd::a);
   Codec<esd> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jq<esd>> d = all.a(mb.aV, c);
   ese<erg> e = a("block_ignore", erg.a);
   ese<eri> f = a("block_rot", eri.a);
   ese<erl> g = a("gravity", erl.a);
   ese<erm> h = a("jigsaw_replacement", erm.a);
   ese<ery> i = a("rule", ery.a);
   ese<erq> j = a("nop", erq.a);
   ese<erf> k = a("block_age", erf.a);
   ese<ere> l = a("blackstone_replace", ere.a);
   ese<ern> m = a("lava_submerged_block", ern.a);
   ese<erv> n = a("protected_blocks", erv.b);
   ese<erk> o = a("capped", erk.a);

   MapCodec<P> codec();

   static <P extends esc> ese<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.af, $$0, () -> $$1);
   }
}
