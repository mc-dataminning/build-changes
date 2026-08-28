import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface eqj<P extends eqh> {
   Codec<eqh> a = lz.af.q().dispatch("processor_type", eqh::a, eqj::codec);
   Codec<eqi> b = a.listOf().xmap(eqi::new, eqi::a);
   Codec<eqi> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jq<eqi>> d = alf.a(ma.aT, c);
   eqj<epl> e = a("block_ignore", epl.a);
   eqj<epn> f = a("block_rot", epn.a);
   eqj<epq> g = a("gravity", epq.a);
   eqj<epr> h = a("jigsaw_replacement", epr.a);
   eqj<eqd> i = a("rule", eqd.a);
   eqj<epv> j = a("nop", epv.a);
   eqj<epk> k = a("block_age", epk.a);
   eqj<epj> l = a("blackstone_replace", epj.a);
   eqj<eps> m = a("lava_submerged_block", eps.a);
   eqj<eqa> n = a("protected_blocks", eqa.b);
   eqj<epp> o = a("capped", epp.a);

   MapCodec<P> codec();

   static <P extends eqh> eqj<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.af, $$0, () -> $$1);
   }
}
