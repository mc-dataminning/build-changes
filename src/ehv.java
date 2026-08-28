import com.mojang.serialization.MapCodec;

public interface ehv<P extends ehu> {
   ehv<eia> a = a("matching_blocks", eia.a);
   ehv<ehz> b = a("matching_block_tag", ehz.e);
   ehv<eib> c = a("matching_fluids", eib.a);
   ehv<ehx> d = a("has_sturdy_face", ehx.a);
   ehv<eie> e = a("solid", eie.a);
   ehv<eid> f = a("replaceable", eid.a);
   ehv<eii> g = a("would_survive", eii.a);
   ehv<ehy> h = a("inside_world_bounds", ehy.a);
   ehv<eht> i = a("any_of", eht.a);
   ehv<ehs> j = a("all_of", ehs.a);
   ehv<eic> k = a("not", eic.a);
   ehv<eig> l = a("true", eig.e);
   ehv<eih> m = a("unobstructed", eih.a);

   MapCodec<P> codec();

   private static <P extends ehu> ehv<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.M, $$0, () -> $$1);
   }
}
