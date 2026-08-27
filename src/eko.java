import com.mojang.serialization.Codec;

public interface eko<P extends ekm> {
   Codec<ekm> a = ld.ah.q().dispatch("processor_type", ekm::a, eko::codec);
   Codec<ekn> b = a.listOf().xmap(ekn::new, ekn::a);
   Codec<ekn> c = axh.e(b.fieldOf("processors").codec(), b);
   Codec<iw<ekn>> d = akd.a(le.aK, c);
   eko<ejr> e = a("block_ignore", ejr.a);
   eko<ejt> f = a("block_rot", ejt.a);
   eko<ejw> g = a("gravity", ejw.a);
   eko<ejx> h = a("jigsaw_replacement", ejx.a);
   eko<eki> i = a("rule", eki.a);
   eko<eka> j = a("nop", eka.a);
   eko<ejq> k = a("block_age", ejq.a);
   eko<ejp> l = a("blackstone_replace", ejp.a);
   eko<ejy> m = a("lava_submerged_block", ejy.a);
   eko<ekf> n = a("protected_blocks", ekf.b);
   eko<ejv> o = a("capped", ejv.a);

   Codec<P> codec();

   static <P extends ekm> eko<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.ah, $$0, () -> $$1);
   }
}
