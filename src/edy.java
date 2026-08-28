import com.mojang.serialization.MapCodec;

public interface edy<P extends edx> {
   edy<eed> a = a("matching_blocks", eed.a);
   edy<eec> b = a("matching_block_tag", eec.e);
   edy<eee> c = a("matching_fluids", eee.a);
   edy<eea> d = a("has_sturdy_face", eea.a);
   edy<eeh> e = a("solid", eeh.a);
   edy<eeg> f = a("replaceable", eeg.a);
   edy<eel> g = a("would_survive", eel.a);
   edy<eeb> h = a("inside_world_bounds", eeb.a);
   edy<edw> i = a("any_of", edw.a);
   edy<edv> j = a("all_of", edv.a);
   edy<eef> k = a("not", eef.a);
   edy<eej> l = a("true", eej.e);
   edy<eek> m = a("unobstructed", eek.a);

   MapCodec<P> codec();

   private static <P extends edx> edy<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.M, $$0, () -> $$1);
   }
}
