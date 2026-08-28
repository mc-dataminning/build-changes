import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface esd<P extends esb> {
   Codec<esb> a = ma.af.q().dispatch("processor_type", esb::a, esd::codec);
   Codec<esc> b = a.listOf().xmap(esc::new, esc::a);
   Codec<esc> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jq<esc>> d = alv.a(mb.aU, c);
   esd<erf> e = a("block_ignore", erf.a);
   esd<erh> f = a("block_rot", erh.a);
   esd<erk> g = a("gravity", erk.a);
   esd<erl> h = a("jigsaw_replacement", erl.a);
   esd<erx> i = a("rule", erx.a);
   esd<erp> j = a("nop", erp.a);
   esd<ere> k = a("block_age", ere.a);
   esd<erd> l = a("blackstone_replace", erd.a);
   esd<erm> m = a("lava_submerged_block", erm.a);
   esd<eru> n = a("protected_blocks", eru.b);
   esd<erj> o = a("capped", erj.a);

   MapCodec<P> codec();

   static <P extends esb> esd<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.af, $$0, () -> $$1);
   }
}
