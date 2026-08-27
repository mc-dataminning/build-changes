import com.mojang.serialization.Codec;

public interface ehb<P extends egz> {
   Codec<egz> a = ki.ah.q().dispatch("processor_type", egz::a, ehb::codec);
   Codec<eha> b = a.listOf().xmap(eha::new, eha::a);
   Codec<eha> c = awe.e(b.fieldOf("processors").codec(), b);
   Codec<il<eha>> d = ajd.a(kj.aF, c);
   ehb<ege> e = a("block_ignore", ege.a);
   ehb<egg> f = a("block_rot", egg.a);
   ehb<egj> g = a("gravity", egj.a);
   ehb<egk> h = a("jigsaw_replacement", egk.a);
   ehb<egv> i = a("rule", egv.a);
   ehb<egn> j = a("nop", egn.a);
   ehb<egd> k = a("block_age", egd.a);
   ehb<egc> l = a("blackstone_replace", egc.a);
   ehb<egl> m = a("lava_submerged_block", egl.a);
   ehb<egs> n = a("protected_blocks", egs.b);
   ehb<egi> o = a("capped", egi.a);

   Codec<P> codec();

   static <P extends egz> ehb<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.ah, $$0, () -> $$1);
   }
}
