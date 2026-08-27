import com.mojang.serialization.Codec;

public interface egf<P extends egd> {
   Codec<egd> a = kh.ah.q().dispatch("processor_type", egd::a, egf::codec);
   Codec<ege> b = a.listOf().xmap(ege::new, ege::a);
   Codec<ege> c = avu.e(b.fieldOf("processors").codec(), b);
   Codec<il<ege>> d = aiy.a(ki.aF, c);
   egf<efi> e = a("block_ignore", efi.a);
   egf<efk> f = a("block_rot", efk.a);
   egf<efn> g = a("gravity", efn.a);
   egf<efo> h = a("jigsaw_replacement", efo.a);
   egf<efz> i = a("rule", efz.a);
   egf<efr> j = a("nop", efr.a);
   egf<efh> k = a("block_age", efh.a);
   egf<efg> l = a("blackstone_replace", efg.a);
   egf<efp> m = a("lava_submerged_block", efp.a);
   egf<efw> n = a("protected_blocks", efw.b);
   egf<efm> o = a("capped", efm.a);

   Codec<P> codec();

   static <P extends egd> egf<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.ah, $$0, () -> $$1);
   }
}
