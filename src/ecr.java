import com.mojang.serialization.MapCodec;

public interface ecr<P extends ecq> {
   ecr<ecw> a = a("matching_blocks", ecw.a);
   ecr<ecv> b = a("matching_block_tag", ecv.e);
   ecr<ecx> c = a("matching_fluids", ecx.a);
   ecr<ect> d = a("has_sturdy_face", ect.a);
   ecr<eda> e = a("solid", eda.a);
   ecr<ecz> f = a("replaceable", ecz.a);
   ecr<ede> g = a("would_survive", ede.a);
   ecr<ecu> h = a("inside_world_bounds", ecu.a);
   ecr<ecp> i = a("any_of", ecp.a);
   ecr<eco> j = a("all_of", eco.a);
   ecr<ecy> k = a("not", ecy.a);
   ecr<edc> l = a("true", edc.e);
   ecr<edd> m = a("unobstructed", edd.a);

   MapCodec<P> codec();

   private static <P extends ecq> ecr<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(lz.M, $$0, () -> $$1);
   }
}
