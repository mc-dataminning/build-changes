import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface enq<P extends eno> {
   Codec<eno> a = lt.af.r().dispatch("processor_type", eno::a, enq::codec);
   Codec<enp> b = a.listOf().xmap(enp::new, enp::a);
   Codec<enp> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jm<enp>> d = akn.a(lu.aS, c);
   enq<ems> e = a("block_ignore", ems.a);
   enq<emu> f = a("block_rot", emu.a);
   enq<emx> g = a("gravity", emx.a);
   enq<emy> h = a("jigsaw_replacement", emy.a);
   enq<enk> i = a("rule", enk.a);
   enq<enc> j = a("nop", enc.a);
   enq<emr> k = a("block_age", emr.a);
   enq<emq> l = a("blackstone_replace", emq.a);
   enq<emz> m = a("lava_submerged_block", emz.a);
   enq<enh> n = a("protected_blocks", enh.b);
   enq<emw> o = a("capped", emw.a);

   MapCodec<P> codec();

   static <P extends eno> enq<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.af, $$0, () -> $$1);
   }
}
