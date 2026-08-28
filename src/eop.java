import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface eop<P extends eon> {
   Codec<eon> a = lu.af.q().dispatch("processor_type", eon::a, eop::codec);
   Codec<eoo> b = a.listOf().xmap(eoo::new, eoo::a);
   Codec<eoo> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jn<eoo>> d = akx.a(lv.aS, c);
   eop<enr> e = a("block_ignore", enr.a);
   eop<ent> f = a("block_rot", ent.a);
   eop<enw> g = a("gravity", enw.a);
   eop<enx> h = a("jigsaw_replacement", enx.a);
   eop<eoj> i = a("rule", eoj.a);
   eop<eob> j = a("nop", eob.a);
   eop<enq> k = a("block_age", enq.a);
   eop<enp> l = a("blackstone_replace", enp.a);
   eop<eny> m = a("lava_submerged_block", eny.a);
   eop<eog> n = a("protected_blocks", eog.b);
   eop<env> o = a("capped", env.a);

   MapCodec<P> codec();

   static <P extends eon> eop<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.af, $$0, () -> $$1);
   }
}
