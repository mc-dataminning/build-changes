import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface eps<P extends epq> {
   Codec<epq> a = lx.af.q().dispatch("processor_type", epq::a, eps::codec);
   Codec<epr> b = a.listOf().xmap(epr::new, epr::a);
   Codec<epr> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jp<epr>> d = ald.a(ly.aT, c);
   eps<eou> e = a("block_ignore", eou.a);
   eps<eow> f = a("block_rot", eow.a);
   eps<eoz> g = a("gravity", eoz.a);
   eps<epa> h = a("jigsaw_replacement", epa.a);
   eps<epm> i = a("rule", epm.a);
   eps<epe> j = a("nop", epe.a);
   eps<eot> k = a("block_age", eot.a);
   eps<eos> l = a("blackstone_replace", eos.a);
   eps<epb> m = a("lava_submerged_block", epb.a);
   eps<epj> n = a("protected_blocks", epj.b);
   eps<eoy> o = a("capped", eoy.a);

   MapCodec<P> codec();

   static <P extends epq> eps<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.af, $$0, () -> $$1);
   }
}
