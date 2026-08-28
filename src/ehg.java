import com.mojang.serialization.MapCodec;

public interface ehg<P extends ehf> {
   ehg<ehl> a = a("matching_blocks", ehl.a);
   ehg<ehk> b = a("matching_block_tag", ehk.e);
   ehg<ehm> c = a("matching_fluids", ehm.a);
   ehg<ehi> d = a("has_sturdy_face", ehi.a);
   ehg<ehp> e = a("solid", ehp.a);
   ehg<eho> f = a("replaceable", eho.a);
   ehg<eht> g = a("would_survive", eht.a);
   ehg<ehj> h = a("inside_world_bounds", ehj.a);
   ehg<ehe> i = a("any_of", ehe.a);
   ehg<ehd> j = a("all_of", ehd.a);
   ehg<ehn> k = a("not", ehn.a);
   ehg<ehr> l = a("true", ehr.e);
   ehg<ehs> m = a("unobstructed", ehs.a);

   MapCodec<P> codec();

   private static <P extends ehf> ehg<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.M, $$0, () -> $$1);
   }
}
