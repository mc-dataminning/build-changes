import com.mojang.serialization.MapCodec;

public interface ecy<P extends ecx> {
   ecy<edd> a = a("matching_blocks", edd.a);
   ecy<edc> b = a("matching_block_tag", edc.e);
   ecy<ede> c = a("matching_fluids", ede.a);
   ecy<eda> d = a("has_sturdy_face", eda.a);
   ecy<edh> e = a("solid", edh.a);
   ecy<edg> f = a("replaceable", edg.a);
   ecy<edl> g = a("would_survive", edl.a);
   ecy<edb> h = a("inside_world_bounds", edb.a);
   ecy<ecw> i = a("any_of", ecw.a);
   ecy<ecv> j = a("all_of", ecv.a);
   ecy<edf> k = a("not", edf.a);
   ecy<edj> l = a("true", edj.e);
   ecy<edk> m = a("unobstructed", edk.a);

   MapCodec<P> codec();

   private static <P extends ecx> ecy<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.M, $$0, () -> $$1);
   }
}
