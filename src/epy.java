import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface epy<P extends epw> {
   Codec<epw> a = ly.af.q().dispatch("processor_type", epw::a, epy::codec);
   Codec<epx> b = a.listOf().xmap(epx::new, epx::a);
   Codec<epx> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jq<epx>> d = ale.a(lz.aT, c);
   epy<epa> e = a("block_ignore", epa.a);
   epy<epc> f = a("block_rot", epc.a);
   epy<epf> g = a("gravity", epf.a);
   epy<epg> h = a("jigsaw_replacement", epg.a);
   epy<eps> i = a("rule", eps.a);
   epy<epk> j = a("nop", epk.a);
   epy<eoz> k = a("block_age", eoz.a);
   epy<eoy> l = a("blackstone_replace", eoy.a);
   epy<eph> m = a("lava_submerged_block", eph.a);
   epy<epp> n = a("protected_blocks", epp.b);
   epy<epe> o = a("capped", epe.a);

   MapCodec<P> codec();

   static <P extends epw> epy<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.af, $$0, () -> $$1);
   }
}
