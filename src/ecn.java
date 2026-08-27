import com.mojang.serialization.Codec;

public interface ecn<P extends ecl> {
   Codec<ecl> a = kb.ah.q().dispatch("processor_type", ecl::a, ecn::codec);
   Codec<ecm> b = a.listOf().xmap(ecm::new, ecm::a);
   Codec<ecm> c = atg.e(b.fieldOf("processors").codec(), b);
   Codec<ie<ecm>> d = agp.a(kc.aD, c);
   ecn<ebq> e = a("block_ignore", ebq.a);
   ecn<ebs> f = a("block_rot", ebs.a);
   ecn<ebv> g = a("gravity", ebv.a);
   ecn<ebw> h = a("jigsaw_replacement", ebw.a);
   ecn<ech> i = a("rule", ech.a);
   ecn<ebz> j = a("nop", ebz.a);
   ecn<ebp> k = a("block_age", ebp.a);
   ecn<ebo> l = a("blackstone_replace", ebo.a);
   ecn<ebx> m = a("lava_submerged_block", ebx.a);
   ecn<ece> n = a("protected_blocks", ece.b);
   ecn<ebu> o = a("capped", ebu.a);

   Codec<P> codec();

   static <P extends ecl> ecn<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.ah, $$0, () -> $$1);
   }
}
