import com.mojang.serialization.Codec;

public interface ens<P extends enq> {
   Codec<enq> a = lh.ah.q().dispatch("processor_type", enq::a, ens::codec);
   Codec<enr> b = a.listOf().xmap(enr::new, enr::a);
   Codec<enr> c = axu.e(b.fieldOf("processors").codec(), b);
   Codec<ja<enr>> d = akp.a(li.aK, c);
   ens<emv> e = a("block_ignore", emv.a);
   ens<emx> f = a("block_rot", emx.a);
   ens<ena> g = a("gravity", ena.a);
   ens<enb> h = a("jigsaw_replacement", enb.a);
   ens<enm> i = a("rule", enm.a);
   ens<ene> j = a("nop", ene.a);
   ens<emu> k = a("block_age", emu.a);
   ens<emt> l = a("blackstone_replace", emt.a);
   ens<enc> m = a("lava_submerged_block", enc.a);
   ens<enj> n = a("protected_blocks", enj.b);
   ens<emz> o = a("capped", emz.a);

   Codec<P> codec();

   static <P extends enq> ens<P> a(String $$0, Codec<P> $$1) {
      return jn.a(lh.ah, $$0, () -> $$1);
   }
}
