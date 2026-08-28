import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface euj<P extends euh> {
   Codec<euh> a = mf.af.q().dispatch("processor_type", euh::a, euj::codec);
   Codec<eui> b = a.listOf().xmap(eui::new, eui::a);
   Codec<eui> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<je<eui>> d = ala.a(mg.ba, c);
   euj<etl> e = a("block_ignore", etl.a);
   euj<etn> f = a("block_rot", etn.a);
   euj<etq> g = a("gravity", etq.a);
   euj<etr> h = a("jigsaw_replacement", etr.a);
   euj<eud> i = a("rule", eud.a);
   euj<etv> j = a("nop", etv.a);
   euj<etk> k = a("block_age", etk.a);
   euj<etj> l = a("blackstone_replace", etj.a);
   euj<ets> m = a("lava_submerged_block", ets.a);
   euj<eua> n = a("protected_blocks", eua.b);
   euj<etp> o = a("capped", etp.a);

   MapCodec<P> codec();

   static <P extends euh> euj<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.af, $$0, () -> $$1);
   }
}
