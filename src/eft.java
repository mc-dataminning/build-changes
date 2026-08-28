import com.mojang.serialization.MapCodec;

public interface eft<P extends efs> {
   eft<efy> a = a("matching_blocks", efy.a);
   eft<efx> b = a("matching_block_tag", efx.e);
   eft<efz> c = a("matching_fluids", efz.a);
   eft<efv> d = a("has_sturdy_face", efv.a);
   eft<egc> e = a("solid", egc.a);
   eft<egb> f = a("replaceable", egb.a);
   eft<egg> g = a("would_survive", egg.a);
   eft<efw> h = a("inside_world_bounds", efw.a);
   eft<efr> i = a("any_of", efr.a);
   eft<efq> j = a("all_of", efq.a);
   eft<ega> k = a("not", ega.a);
   eft<ege> l = a("true", ege.e);
   eft<egf> m = a("unobstructed", egf.a);

   MapCodec<P> codec();

   private static <P extends efs> eft<P> a(String $$0, MapCodec<P> $$1) {
      return kf.a(md.M, $$0, () -> $$1);
   }
}
