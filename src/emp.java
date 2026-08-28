import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface emp<P extends emn> {
   Codec<emn> a = lq.af.r().dispatch("processor_type", emn::a, emp::codec);
   Codec<emo> b = a.listOf().xmap(emo::new, emo::a);
   Codec<emo> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jj<emo>> d = akg.a(lr.aR, c);
   emp<els> e = a("block_ignore", els.a);
   emp<elu> f = a("block_rot", elu.a);
   emp<elx> g = a("gravity", elx.a);
   emp<ely> h = a("jigsaw_replacement", ely.a);
   emp<emj> i = a("rule", emj.a);
   emp<emb> j = a("nop", emb.a);
   emp<elr> k = a("block_age", elr.a);
   emp<elq> l = a("blackstone_replace", elq.a);
   emp<elz> m = a("lava_submerged_block", elz.a);
   emp<emg> n = a("protected_blocks", emg.b);
   emp<elw> o = a("capped", elw.a);

   MapCodec<P> codec();

   static <P extends emn> emp<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.af, $$0, () -> $$1);
   }
}
