import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface emv<P extends emt> {
   Codec<emt> a = lq.af.r().dispatch("processor_type", emt::a, emv::codec);
   Codec<emu> b = a.listOf().xmap(emu::new, emu::a);
   Codec<emu> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jj<emu>> d = akg.a(lr.aR, c);
   emv<ely> e = a("block_ignore", ely.a);
   emv<ema> f = a("block_rot", ema.a);
   emv<emd> g = a("gravity", emd.a);
   emv<eme> h = a("jigsaw_replacement", eme.a);
   emv<emp> i = a("rule", emp.a);
   emv<emh> j = a("nop", emh.a);
   emv<elx> k = a("block_age", elx.a);
   emv<elw> l = a("blackstone_replace", elw.a);
   emv<emf> m = a("lava_submerged_block", emf.a);
   emv<emm> n = a("protected_blocks", emm.b);
   emv<emc> o = a("capped", emc.a);

   MapCodec<P> codec();

   static <P extends emt> emv<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.af, $$0, () -> $$1);
   }
}
