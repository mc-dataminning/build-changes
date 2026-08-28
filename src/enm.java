import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface enm<P extends enk> {
   Codec<enk> a = lt.af.r().dispatch("processor_type", enk::a, enm::codec);
   Codec<enl> b = a.listOf().xmap(enl::new, enl::a);
   Codec<enl> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jm<enl>> d = akm.a(lu.aS, c);
   enm<emp> e = a("block_ignore", emp.a);
   enm<emr> f = a("block_rot", emr.a);
   enm<emu> g = a("gravity", emu.a);
   enm<emv> h = a("jigsaw_replacement", emv.a);
   enm<eng> i = a("rule", eng.a);
   enm<emy> j = a("nop", emy.a);
   enm<emo> k = a("block_age", emo.a);
   enm<emn> l = a("blackstone_replace", emn.a);
   enm<emw> m = a("lava_submerged_block", emw.a);
   enm<end> n = a("protected_blocks", end.b);
   enm<emt> o = a("capped", emt.a);

   MapCodec<P> codec();

   static <P extends enk> enm<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.af, $$0, () -> $$1);
   }
}
