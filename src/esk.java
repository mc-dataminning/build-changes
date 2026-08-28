import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface esk<P extends esi> {
   Codec<esi> a = ma.af.q().dispatch("processor_type", esi::a, esk::codec);
   Codec<esj> b = a.listOf().xmap(esj::new, esj::a);
   Codec<esj> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jq<esj>> d = alv.a(mb.aV, c);
   esk<erm> e = a("block_ignore", erm.a);
   esk<ero> f = a("block_rot", ero.a);
   esk<err> g = a("gravity", err.a);
   esk<ers> h = a("jigsaw_replacement", ers.a);
   esk<ese> i = a("rule", ese.a);
   esk<erw> j = a("nop", erw.a);
   esk<erl> k = a("block_age", erl.a);
   esk<erk> l = a("blackstone_replace", erk.a);
   esk<ert> m = a("lava_submerged_block", ert.a);
   esk<esb> n = a("protected_blocks", esb.b);
   esk<erq> o = a("capped", erq.a);

   MapCodec<P> codec();

   static <P extends esi> esk<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.af, $$0, () -> $$1);
   }
}
