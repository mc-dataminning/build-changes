import com.mojang.serialization.Codec;

public interface ehd<P extends ehb> {
   Codec<ehb> a = ki.ah.q().dispatch("processor_type", ehb::a, ehd::codec);
   Codec<ehc> b = a.listOf().xmap(ehc::new, ehc::a);
   Codec<ehc> c = awe.e(b.fieldOf("processors").codec(), b);
   Codec<il<ehc>> d = ajd.a(kj.aF, c);
   ehd<egg> e = a("block_ignore", egg.a);
   ehd<egi> f = a("block_rot", egi.a);
   ehd<egl> g = a("gravity", egl.a);
   ehd<egm> h = a("jigsaw_replacement", egm.a);
   ehd<egx> i = a("rule", egx.a);
   ehd<egp> j = a("nop", egp.a);
   ehd<egf> k = a("block_age", egf.a);
   ehd<ege> l = a("blackstone_replace", ege.a);
   ehd<egn> m = a("lava_submerged_block", egn.a);
   ehd<egu> n = a("protected_blocks", egu.b);
   ehd<egk> o = a("capped", egk.a);

   Codec<P> codec();

   static <P extends ehb> ehd<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.ah, $$0, () -> $$1);
   }
}
