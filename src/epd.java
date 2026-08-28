import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface epd<P extends epb> {
   Codec<epb> a = lu.af.q().dispatch("processor_type", epb::a, epd::codec);
   Codec<epc> b = a.listOf().xmap(epc::new, epc::a);
   Codec<epc> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jn<epc>> d = aky.a(lv.aT, c);
   epd<eof> e = a("block_ignore", eof.a);
   epd<eoh> f = a("block_rot", eoh.a);
   epd<eok> g = a("gravity", eok.a);
   epd<eol> h = a("jigsaw_replacement", eol.a);
   epd<eox> i = a("rule", eox.a);
   epd<eop> j = a("nop", eop.a);
   epd<eoe> k = a("block_age", eoe.a);
   epd<eod> l = a("blackstone_replace", eod.a);
   epd<eom> m = a("lava_submerged_block", eom.a);
   epd<eou> n = a("protected_blocks", eou.b);
   epd<eoj> o = a("capped", eoj.a);

   MapCodec<P> codec();

   static <P extends epb> epd<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.af, $$0, () -> $$1);
   }
}
