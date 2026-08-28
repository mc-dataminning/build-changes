import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ewc<P extends ewa> {
   Codec<ewa> a = mg.af.q().dispatch("processor_type", ewa::a, ewc::codec);
   Codec<ewb> b = a.listOf().xmap(ewb::new, ewb::a);
   Codec<ewb> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jf<ewb>> d = ale.a(mh.bc, c);
   ewc<eve> e = a("block_ignore", eve.a);
   ewc<evg> f = a("block_rot", evg.a);
   ewc<evj> g = a("gravity", evj.a);
   ewc<evk> h = a("jigsaw_replacement", evk.a);
   ewc<evw> i = a("rule", evw.a);
   ewc<evo> j = a("nop", evo.a);
   ewc<evd> k = a("block_age", evd.a);
   ewc<evc> l = a("blackstone_replace", evc.a);
   ewc<evl> m = a("lava_submerged_block", evl.a);
   ewc<evt> n = a("protected_blocks", evt.b);
   ewc<evi> o = a("capped", evi.a);

   MapCodec<P> codec();

   static <P extends ewa> ewc<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.af, $$0, () -> $$1);
   }
}
