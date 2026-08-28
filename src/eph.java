import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface eph<P extends epf> {
   Codec<epf> a = lv.af.q().dispatch("processor_type", epf::a, eph::codec);
   Codec<epg> b = a.listOf().xmap(epg::new, epg::a);
   Codec<epg> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jo<epg>> d = ala.a(lw.aU, c);
   eph<eoj> e = a("block_ignore", eoj.a);
   eph<eol> f = a("block_rot", eol.a);
   eph<eoo> g = a("gravity", eoo.a);
   eph<eop> h = a("jigsaw_replacement", eop.a);
   eph<epb> i = a("rule", epb.a);
   eph<eot> j = a("nop", eot.a);
   eph<eoi> k = a("block_age", eoi.a);
   eph<eoh> l = a("blackstone_replace", eoh.a);
   eph<eoq> m = a("lava_submerged_block", eoq.a);
   eph<eoy> n = a("protected_blocks", eoy.b);
   eph<eon> o = a("capped", eon.a);

   MapCodec<P> codec();

   static <P extends epf> eph<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.af, $$0, () -> $$1);
   }
}
