import com.mojang.serialization.Codec;

public interface ejg<P extends eje> {
   Codec<eje> a = kr.ah.q().dispatch("processor_type", eje::a, ejg::codec);
   Codec<ejf> b = a.listOf().xmap(ejf::new, ejf::a);
   Codec<ejf> c = aws.e(b.fieldOf("processors").codec(), b);
   Codec<il<ejf>> d = ajp.a(ks.aG, c);
   ejg<eij> e = a("block_ignore", eij.a);
   ejg<eil> f = a("block_rot", eil.a);
   ejg<eio> g = a("gravity", eio.a);
   ejg<eip> h = a("jigsaw_replacement", eip.a);
   ejg<eja> i = a("rule", eja.a);
   ejg<eis> j = a("nop", eis.a);
   ejg<eii> k = a("block_age", eii.a);
   ejg<eih> l = a("blackstone_replace", eih.a);
   ejg<eiq> m = a("lava_submerged_block", eiq.a);
   ejg<eix> n = a("protected_blocks", eix.b);
   ejg<ein> o = a("capped", ein.a);

   Codec<P> codec();

   static <P extends eje> ejg<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.ah, $$0, () -> $$1);
   }
}
