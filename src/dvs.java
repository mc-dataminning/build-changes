import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public interface dvs<P extends dvq> {
   Codec<dvq> a = jb.ah.q().dispatch("processor_type", dvq::a, dvs::codec);
   Codec<dvr> b = a.listOf().xmap(dvr::new, dvr::a);
   Codec<dvr> c = Codec.either(b.fieldOf("processors").codec(), b).xmap($$0 -> (dvr)$$0.map($$0x -> $$0x, $$0x -> $$0x), Either::left);
   Codec<he<dvr>> d = acm.a(jc.aA, c);
   dvs<duv> e = a("block_ignore", duv.a);
   dvs<dux> f = a("block_rot", dux.a);
   dvs<dva> g = a("gravity", dva.a);
   dvs<dvb> h = a("jigsaw_replacement", dvb.a);
   dvs<dvm> i = a("rule", dvm.a);
   dvs<dve> j = a("nop", dve.a);
   dvs<duu> k = a("block_age", duu.a);
   dvs<dut> l = a("blackstone_replace", dut.a);
   dvs<dvc> m = a("lava_submerged_block", dvc.a);
   dvs<dvj> n = a("protected_blocks", dvj.b);
   dvs<duz> o = a("capped", duz.a);

   Codec<P> codec();

   static <P extends dvq> dvs<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.ah, $$0, () -> $$1);
   }
}
