import com.mojang.serialization.Codec;

public interface dtu<P extends dtt> {
   dtu<dtz> a = a("matching_blocks", dtz.a);
   dtu<dty> b = a("matching_block_tag", dty.e);
   dtu<dua> c = a("matching_fluids", dua.a);
   dtu<dtw> d = a("has_sturdy_face", dtw.a);
   dtu<dud> e = a("solid", dud.a);
   dtu<duc> f = a("replaceable", duc.a);
   dtu<dug> g = a("would_survive", dug.a);
   dtu<dtx> h = a("inside_world_bounds", dtx.a);
   dtu<dts> i = a("any_of", dts.a);
   dtu<dtr> j = a("all_of", dtr.a);
   dtu<dub> k = a("not", dub.a);
   dtu<duf> l = a("true", duf.e);

   Codec<P> codec();

   private static <P extends dtt> dtu<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.O, $$0, () -> $$1);
   }
}
