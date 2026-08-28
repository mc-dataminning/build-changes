import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ewe<P extends ewc> {
   Codec<ewc> a = mh.af.q().dispatch("processor_type", ewc::a, ewe::codec);
   Codec<ewd> b = a.listOf().xmap(ewd::new, ewd::a);
   Codec<ewd> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jg<ewd>> d = alg.a(mi.bc, c);
   ewe<evg> e = a("block_ignore", evg.a);
   ewe<evi> f = a("block_rot", evi.a);
   ewe<evl> g = a("gravity", evl.a);
   ewe<evm> h = a("jigsaw_replacement", evm.a);
   ewe<evy> i = a("rule", evy.a);
   ewe<evq> j = a("nop", evq.a);
   ewe<evf> k = a("block_age", evf.a);
   ewe<eve> l = a("blackstone_replace", eve.a);
   ewe<evn> m = a("lava_submerged_block", evn.a);
   ewe<evv> n = a("protected_blocks", evv.b);
   ewe<evk> o = a("capped", evk.a);

   MapCodec<P> codec();

   static <P extends ewc> ewe<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.af, $$0, () -> $$1);
   }
}
