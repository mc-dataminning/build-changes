import com.mojang.serialization.MapCodec;

public interface edz<P extends edy> {
   edz<eee> a = a("matching_blocks", eee.a);
   edz<eed> b = a("matching_block_tag", eed.e);
   edz<eef> c = a("matching_fluids", eef.a);
   edz<eeb> d = a("has_sturdy_face", eeb.a);
   edz<eei> e = a("solid", eei.a);
   edz<eeh> f = a("replaceable", eeh.a);
   edz<eem> g = a("would_survive", eem.a);
   edz<eec> h = a("inside_world_bounds", eec.a);
   edz<edx> i = a("any_of", edx.a);
   edz<edw> j = a("all_of", edw.a);
   edz<eeg> k = a("not", eeg.a);
   edz<eek> l = a("true", eek.e);
   edz<eel> m = a("unobstructed", eel.a);

   MapCodec<P> codec();

   private static <P extends edy> edz<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.M, $$0, () -> $$1);
   }
}
