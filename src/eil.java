import com.mojang.serialization.MapCodec;

public interface eil<P extends eik> {
   eil<eiq> a = a("matching_blocks", eiq.a);
   eil<eip> b = a("matching_block_tag", eip.e);
   eil<eir> c = a("matching_fluids", eir.a);
   eil<ein> d = a("has_sturdy_face", ein.a);
   eil<eiu> e = a("solid", eiu.a);
   eil<eit> f = a("replaceable", eit.a);
   eil<eiy> g = a("would_survive", eiy.a);
   eil<eio> h = a("inside_world_bounds", eio.a);
   eil<eij> i = a("any_of", eij.a);
   eil<eii> j = a("all_of", eii.a);
   eil<eis> k = a("not", eis.a);
   eil<eiw> l = a("true", eiw.e);
   eil<eix> m = a("unobstructed", eix.a);

   MapCodec<P> codec();

   private static <P extends eik> eil<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.M, $$0, () -> $$1);
   }
}
