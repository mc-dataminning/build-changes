import com.mojang.serialization.MapCodec;

public interface dyb<P extends dya> {
   dyb<dyg> a = a("matching_blocks", dyg.a);
   dyb<dyf> b = a("matching_block_tag", dyf.e);
   dyb<dyh> c = a("matching_fluids", dyh.a);
   dyb<dyd> d = a("has_sturdy_face", dyd.a);
   dyb<dyk> e = a("solid", dyk.a);
   dyb<dyj> f = a("replaceable", dyj.a);
   dyb<dyn> g = a("would_survive", dyn.a);
   dyb<dye> h = a("inside_world_bounds", dye.a);
   dyb<dxz> i = a("any_of", dxz.a);
   dyb<dxy> j = a("all_of", dxy.a);
   dyb<dyi> k = a("not", dyi.a);
   dyb<dym> l = a("true", dym.e);

   MapCodec<P> codec();

   private static <P extends dya> dyb<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.O, $$0, () -> $$1);
   }
}
