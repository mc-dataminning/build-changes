import com.mojang.serialization.MapCodec;

public interface eea<P extends edz> {
   eea<eef> a = a("matching_blocks", eef.a);
   eea<eee> b = a("matching_block_tag", eee.e);
   eea<eeg> c = a("matching_fluids", eeg.a);
   eea<eec> d = a("has_sturdy_face", eec.a);
   eea<eej> e = a("solid", eej.a);
   eea<eei> f = a("replaceable", eei.a);
   eea<een> g = a("would_survive", een.a);
   eea<eed> h = a("inside_world_bounds", eed.a);
   eea<edy> i = a("any_of", edy.a);
   eea<edx> j = a("all_of", edx.a);
   eea<eeh> k = a("not", eeh.a);
   eea<eel> l = a("true", eel.e);
   eea<eem> m = a("unobstructed", eem.a);

   MapCodec<P> codec();

   private static <P extends edz> eea<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.M, $$0, () -> $$1);
   }
}
