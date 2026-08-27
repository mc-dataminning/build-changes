import com.mojang.serialization.MapCodec;

public interface dyd<P extends dyc> {
   dyd<dyi> a = a("matching_blocks", dyi.a);
   dyd<dyh> b = a("matching_block_tag", dyh.e);
   dyd<dyj> c = a("matching_fluids", dyj.a);
   dyd<dyf> d = a("has_sturdy_face", dyf.a);
   dyd<dym> e = a("solid", dym.a);
   dyd<dyl> f = a("replaceable", dyl.a);
   dyd<dyp> g = a("would_survive", dyp.a);
   dyd<dyg> h = a("inside_world_bounds", dyg.a);
   dyd<dyb> i = a("any_of", dyb.a);
   dyd<dya> j = a("all_of", dya.a);
   dyd<dyk> k = a("not", dyk.a);
   dyd<dyo> l = a("true", dyo.e);

   MapCodec<P> codec();

   private static <P extends dyc> dyd<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.O, $$0, () -> $$1);
   }
}
