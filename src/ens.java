import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ens<P extends enq> {
   Codec<enq> a = lt.af.r().dispatch("processor_type", enq::a, ens::codec);
   Codec<enr> b = a.listOf().xmap(enr::new, enr::a);
   Codec<enr> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jm<enr>> d = akn.a(lu.aS, c);
   ens<emu> e = a("block_ignore", emu.a);
   ens<emw> f = a("block_rot", emw.a);
   ens<emz> g = a("gravity", emz.a);
   ens<ena> h = a("jigsaw_replacement", ena.a);
   ens<enm> i = a("rule", enm.a);
   ens<ene> j = a("nop", ene.a);
   ens<emt> k = a("block_age", emt.a);
   ens<ems> l = a("blackstone_replace", ems.a);
   ens<enb> m = a("lava_submerged_block", enb.a);
   ens<enj> n = a("protected_blocks", enj.b);
   ens<emy> o = a("capped", emy.a);

   MapCodec<P> codec();

   static <P extends enq> ens<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.af, $$0, () -> $$1);
   }
}
