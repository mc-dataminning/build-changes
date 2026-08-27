import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface eli<P extends elg> {
   Codec<elg> a = le.ah.q().dispatch("processor_type", elg::a, eli::codec);
   Codec<elh> b = a.listOf().xmap(elh::new, elh::a);
   Codec<elh> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<ix<elh>> d = aki.a(lf.aK, c);
   eli<ekl> e = a("block_ignore", ekl.a);
   eli<ekn> f = a("block_rot", ekn.a);
   eli<ekq> g = a("gravity", ekq.a);
   eli<ekr> h = a("jigsaw_replacement", ekr.a);
   eli<elc> i = a("rule", elc.a);
   eli<eku> j = a("nop", eku.a);
   eli<ekk> k = a("block_age", ekk.a);
   eli<ekj> l = a("blackstone_replace", ekj.a);
   eli<eks> m = a("lava_submerged_block", eks.a);
   eli<ekz> n = a("protected_blocks", ekz.b);
   eli<ekp> o = a("capped", ekp.a);

   MapCodec<P> codec();

   static <P extends elg> eli<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.ah, $$0, () -> $$1);
   }
}
