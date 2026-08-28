import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface emi<P extends emg> {
   Codec<emg> a = lp.ah.q().dispatch("processor_type", emg::a, emi::codec);
   Codec<emh> b = a.listOf().xmap(emh::new, emh::a);
   Codec<emh> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<ji<emh>> d = ala.a(lq.aK, c);
   emi<ell> e = a("block_ignore", ell.a);
   emi<eln> f = a("block_rot", eln.a);
   emi<elq> g = a("gravity", elq.a);
   emi<elr> h = a("jigsaw_replacement", elr.a);
   emi<emc> i = a("rule", emc.a);
   emi<elu> j = a("nop", elu.a);
   emi<elk> k = a("block_age", elk.a);
   emi<elj> l = a("blackstone_replace", elj.a);
   emi<els> m = a("lava_submerged_block", els.a);
   emi<elz> n = a("protected_blocks", elz.b);
   emi<elp> o = a("capped", elp.a);

   MapCodec<P> codec();

   static <P extends emg> emi<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.ah, $$0, () -> $$1);
   }
}
