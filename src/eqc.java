import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface eqc<P extends eqa> {
   Codec<eqa> a = lz.af.q().dispatch("processor_type", eqa::a, eqc::codec);
   Codec<eqb> b = a.listOf().xmap(eqb::new, eqb::a);
   Codec<eqb> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jq<eqb>> d = alh.a(ma.aT, c);
   eqc<epe> e = a("block_ignore", epe.a);
   eqc<epg> f = a("block_rot", epg.a);
   eqc<epj> g = a("gravity", epj.a);
   eqc<epk> h = a("jigsaw_replacement", epk.a);
   eqc<epw> i = a("rule", epw.a);
   eqc<epo> j = a("nop", epo.a);
   eqc<epd> k = a("block_age", epd.a);
   eqc<epc> l = a("blackstone_replace", epc.a);
   eqc<epl> m = a("lava_submerged_block", epl.a);
   eqc<ept> n = a("protected_blocks", ept.b);
   eqc<epi> o = a("capped", epi.a);

   MapCodec<P> codec();

   static <P extends eqa> eqc<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.af, $$0, () -> $$1);
   }
}
