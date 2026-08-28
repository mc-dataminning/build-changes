import com.mojang.serialization.MapCodec;

public interface ecn<P extends ecm> {
   ecn<ecs> a = a("matching_blocks", ecs.a);
   ecn<ecr> b = a("matching_block_tag", ecr.e);
   ecn<ect> c = a("matching_fluids", ect.a);
   ecn<ecp> d = a("has_sturdy_face", ecp.a);
   ecn<ecw> e = a("solid", ecw.a);
   ecn<ecv> f = a("replaceable", ecv.a);
   ecn<eda> g = a("would_survive", eda.a);
   ecn<ecq> h = a("inside_world_bounds", ecq.a);
   ecn<ecl> i = a("any_of", ecl.a);
   ecn<eck> j = a("all_of", eck.a);
   ecn<ecu> k = a("not", ecu.a);
   ecn<ecy> l = a("true", ecy.e);
   ecn<ecz> m = a("unobstructed", ecz.a);

   MapCodec<P> codec();

   private static <P extends ecm> ecn<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.M, $$0, () -> $$1);
   }
}
