import com.mojang.serialization.MapCodec;

public interface egv<P extends egu> {
   egv<eha> a = a("matching_blocks", eha.a);
   egv<egz> b = a("matching_block_tag", egz.e);
   egv<ehb> c = a("matching_fluids", ehb.a);
   egv<egx> d = a("has_sturdy_face", egx.a);
   egv<ehe> e = a("solid", ehe.a);
   egv<ehd> f = a("replaceable", ehd.a);
   egv<ehi> g = a("would_survive", ehi.a);
   egv<egy> h = a("inside_world_bounds", egy.a);
   egv<egt> i = a("any_of", egt.a);
   egv<egs> j = a("all_of", egs.a);
   egv<ehc> k = a("not", ehc.a);
   egv<ehg> l = a("true", ehg.e);
   egv<ehh> m = a("unobstructed", ehh.a);

   MapCodec<P> codec();

   private static <P extends egu> egv<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.M, $$0, () -> $$1);
   }
}
