import com.mojang.serialization.Codec;

public interface dzs<P extends dzq> {
   Codec<dzq> a = jy.ai.q().dispatch("processor_type", dzq::a, dzs::codec);
   Codec<dzr> b = a.listOf().xmap(dzr::new, dzr::a);
   Codec<dzr> c = asg.e(b.fieldOf("processors").codec(), b);
   Codec<ib<dzr>> d = afs.a(jz.aB, c);
   dzs<dyv> e = a("block_ignore", dyv.a);
   dzs<dyx> f = a("block_rot", dyx.a);
   dzs<dza> g = a("gravity", dza.a);
   dzs<dzb> h = a("jigsaw_replacement", dzb.a);
   dzs<dzm> i = a("rule", dzm.a);
   dzs<dze> j = a("nop", dze.a);
   dzs<dyu> k = a("block_age", dyu.a);
   dzs<dyt> l = a("blackstone_replace", dyt.a);
   dzs<dzc> m = a("lava_submerged_block", dzc.a);
   dzs<dzj> n = a("protected_blocks", dzj.b);
   dzs<dyz> o = a("capped", dyz.a);

   Codec<P> codec();

   static <P extends dzq> dzs<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.ai, $$0, () -> $$1);
   }
}
