import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface elk<P extends eli> {
   Codec<eli> a = le.ah.q().dispatch("processor_type", eli::a, elk::codec);
   Codec<elj> b = a.listOf().xmap(elj::new, elj::a);
   Codec<elj> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<ix<elj>> d = akj.a(lf.aK, c);
   elk<ekn> e = a("block_ignore", ekn.a);
   elk<ekp> f = a("block_rot", ekp.a);
   elk<eks> g = a("gravity", eks.a);
   elk<ekt> h = a("jigsaw_replacement", ekt.a);
   elk<ele> i = a("rule", ele.a);
   elk<ekw> j = a("nop", ekw.a);
   elk<ekm> k = a("block_age", ekm.a);
   elk<ekl> l = a("blackstone_replace", ekl.a);
   elk<eku> m = a("lava_submerged_block", eku.a);
   elk<elb> n = a("protected_blocks", elb.b);
   elk<ekr> o = a("capped", ekr.a);

   MapCodec<P> codec();

   static <P extends eli> elk<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.ah, $$0, () -> $$1);
   }
}
