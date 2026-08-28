import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface ewo<P extends ewm> {
   Codec<ewm> a = mh.af.q().dispatch("processor_type", ewm::a, ewo::codec);
   Codec<ewn> b = a.listOf().xmap(ewn::new, ewn::a);
   Codec<ewn> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jg<ewn>> d = aln.a(mi.bc, c);
   ewo<evq> e = a("block_ignore", evq.a);
   ewo<evs> f = a("block_rot", evs.a);
   ewo<evv> g = a("gravity", evv.a);
   ewo<evw> h = a("jigsaw_replacement", evw.a);
   ewo<ewi> i = a("rule", ewi.a);
   ewo<ewa> j = a("nop", ewa.a);
   ewo<evp> k = a("block_age", evp.a);
   ewo<evo> l = a("blackstone_replace", evo.a);
   ewo<evx> m = a("lava_submerged_block", evx.a);
   ewo<ewf> n = a("protected_blocks", ewf.b);
   ewo<evu> o = a("capped", evu.a);

   MapCodec<P> codec();

   static <P extends ewm> ewo<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.af, $$0, () -> $$1);
   }
}
