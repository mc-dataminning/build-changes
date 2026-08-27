import com.mojang.serialization.Codec;

public interface ejp<P extends ejn> {
   Codec<ejn> a = kt.ah.q().dispatch("processor_type", ejn::a, ejp::codec);
   Codec<ejo> b = a.listOf().xmap(ejo::new, ejo::a);
   Codec<ejo> c = awu.e(b.fieldOf("processors").codec(), b);
   Codec<in<ejo>> d = ajr.a(ku.aH, c);
   ejp<eis> e = a("block_ignore", eis.a);
   ejp<eiu> f = a("block_rot", eiu.a);
   ejp<eix> g = a("gravity", eix.a);
   ejp<eiy> h = a("jigsaw_replacement", eiy.a);
   ejp<ejj> i = a("rule", ejj.a);
   ejp<ejb> j = a("nop", ejb.a);
   ejp<eir> k = a("block_age", eir.a);
   ejp<eiq> l = a("blackstone_replace", eiq.a);
   ejp<eiz> m = a("lava_submerged_block", eiz.a);
   ejp<ejg> n = a("protected_blocks", ejg.b);
   ejp<eiw> o = a("capped", eiw.a);

   Codec<P> codec();

   static <P extends ejn> ejp<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.ah, $$0, () -> $$1);
   }
}
