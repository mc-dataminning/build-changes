import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface esl<P extends esj> {
   Codec<esj> a = ma.af.q().dispatch("processor_type", esj::a, esl::codec);
   Codec<esk> b = a.listOf().xmap(esk::new, esk::a);
   Codec<esk> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jq<esk>> d = alv.a(mb.aV, c);
   esl<ern> e = a("block_ignore", ern.a);
   esl<erp> f = a("block_rot", erp.a);
   esl<ers> g = a("gravity", ers.a);
   esl<ert> h = a("jigsaw_replacement", ert.a);
   esl<esf> i = a("rule", esf.a);
   esl<erx> j = a("nop", erx.a);
   esl<erm> k = a("block_age", erm.a);
   esl<erl> l = a("blackstone_replace", erl.a);
   esl<eru> m = a("lava_submerged_block", eru.a);
   esl<esc> n = a("protected_blocks", esc.b);
   esl<err> o = a("capped", err.a);

   MapCodec<P> codec();

   static <P extends esj> esl<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.af, $$0, () -> $$1);
   }
}
