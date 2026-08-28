import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface emx<P extends emv> {
   Codec<emv> a = lq.af.r().dispatch("processor_type", emv::a, emx::codec);
   Codec<emw> b = a.listOf().xmap(emw::new, emw::a);
   Codec<emw> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jj<emw>> d = akg.a(lr.aR, c);
   emx<ema> e = a("block_ignore", ema.a);
   emx<emc> f = a("block_rot", emc.a);
   emx<emf> g = a("gravity", emf.a);
   emx<emg> h = a("jigsaw_replacement", emg.a);
   emx<emr> i = a("rule", emr.a);
   emx<emj> j = a("nop", emj.a);
   emx<elz> k = a("block_age", elz.a);
   emx<ely> l = a("blackstone_replace", ely.a);
   emx<emh> m = a("lava_submerged_block", emh.a);
   emx<emo> n = a("protected_blocks", emo.b);
   emx<eme> o = a("capped", eme.a);

   MapCodec<P> codec();

   static <P extends emv> emx<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.af, $$0, () -> $$1);
   }
}
