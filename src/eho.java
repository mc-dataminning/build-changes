import com.mojang.serialization.MapCodec;

public interface eho<P extends ehn> {
   eho<eht> a = a("matching_blocks", eht.a);
   eho<ehs> b = a("matching_block_tag", ehs.e);
   eho<ehu> c = a("matching_fluids", ehu.a);
   eho<ehq> d = a("has_sturdy_face", ehq.a);
   eho<ehx> e = a("solid", ehx.a);
   eho<ehw> f = a("replaceable", ehw.a);
   eho<eib> g = a("would_survive", eib.a);
   eho<ehr> h = a("inside_world_bounds", ehr.a);
   eho<ehm> i = a("any_of", ehm.a);
   eho<ehl> j = a("all_of", ehl.a);
   eho<ehv> k = a("not", ehv.a);
   eho<ehz> l = a("true", ehz.e);
   eho<eia> m = a("unobstructed", eia.a);

   MapCodec<P> codec();

   private static <P extends ehn> eho<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.M, $$0, () -> $$1);
   }
}
