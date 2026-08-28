import com.mojang.serialization.MapCodec;

public interface ech<P extends ecg> {
   ech<ecm> a = a("matching_blocks", ecm.a);
   ech<ecl> b = a("matching_block_tag", ecl.e);
   ech<ecn> c = a("matching_fluids", ecn.a);
   ech<ecj> d = a("has_sturdy_face", ecj.a);
   ech<ecq> e = a("solid", ecq.a);
   ech<ecp> f = a("replaceable", ecp.a);
   ech<ecu> g = a("would_survive", ecu.a);
   ech<eck> h = a("inside_world_bounds", eck.a);
   ech<ecf> i = a("any_of", ecf.a);
   ech<ece> j = a("all_of", ece.a);
   ech<eco> k = a("not", eco.a);
   ech<ecs> l = a("true", ecs.e);
   ech<ect> m = a("unobstructed", ect.a);

   MapCodec<P> codec();

   private static <P extends ecg> ech<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.M, $$0, () -> $$1);
   }
}
