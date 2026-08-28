import com.mojang.serialization.MapCodec;

public interface eia<P extends ehz> {
   eia<eif> a = a("matching_blocks", eif.a);
   eia<eie> b = a("matching_block_tag", eie.e);
   eia<eig> c = a("matching_fluids", eig.a);
   eia<eic> d = a("has_sturdy_face", eic.a);
   eia<eij> e = a("solid", eij.a);
   eia<eii> f = a("replaceable", eii.a);
   eia<ein> g = a("would_survive", ein.a);
   eia<eid> h = a("inside_world_bounds", eid.a);
   eia<ehy> i = a("any_of", ehy.a);
   eia<ehx> j = a("all_of", ehx.a);
   eia<eih> k = a("not", eih.a);
   eia<eil> l = a("true", eil.e);
   eia<eim> m = a("unobstructed", eim.a);

   MapCodec<P> codec();

   private static <P extends ehz> eia<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.M, $$0, () -> $$1);
   }
}
