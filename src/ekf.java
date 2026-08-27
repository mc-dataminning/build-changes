import com.mojang.serialization.Codec;

public interface ekf<P extends ekd> {
   Codec<ekd> a = lc.ah.q().dispatch("processor_type", ekd::a, ekf::codec);
   Codec<eke> b = a.listOf().xmap(eke::new, eke::a);
   Codec<eke> c = axe.e(b.fieldOf("processors").codec(), b);
   Codec<iv<eke>> d = akb.a(ld.aJ, c);
   ekf<eji> e = a("block_ignore", eji.a);
   ekf<ejk> f = a("block_rot", ejk.a);
   ekf<ejn> g = a("gravity", ejn.a);
   ekf<ejo> h = a("jigsaw_replacement", ejo.a);
   ekf<ejz> i = a("rule", ejz.a);
   ekf<ejr> j = a("nop", ejr.a);
   ekf<ejh> k = a("block_age", ejh.a);
   ekf<ejg> l = a("blackstone_replace", ejg.a);
   ekf<ejp> m = a("lava_submerged_block", ejp.a);
   ekf<ejw> n = a("protected_blocks", ejw.b);
   ekf<ejm> o = a("capped", ejm.a);

   Codec<P> codec();

   static <P extends ekd> ekf<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.ah, $$0, () -> $$1);
   }
}
