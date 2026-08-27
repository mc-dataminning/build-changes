import com.mojang.serialization.Codec;

public interface dtw<P extends dtv> {
   dtw<dub> a = a("matching_blocks", dub.a);
   dtw<dua> b = a("matching_block_tag", dua.e);
   dtw<duc> c = a("matching_fluids", duc.a);
   dtw<dty> d = a("has_sturdy_face", dty.a);
   dtw<duf> e = a("solid", duf.a);
   dtw<due> f = a("replaceable", due.a);
   dtw<dui> g = a("would_survive", dui.a);
   dtw<dtz> h = a("inside_world_bounds", dtz.a);
   dtw<dtu> i = a("any_of", dtu.a);
   dtw<dtt> j = a("all_of", dtt.a);
   dtw<dud> k = a("not", dud.a);
   dtw<duh> l = a("true", duh.e);

   Codec<P> codec();

   private static <P extends dtv> dtw<P> a(String $$0, Codec<P> $$1) {
      return iy.a(ki.O, $$0, () -> $$1);
   }
}
