import com.mojang.serialization.Codec;

public interface dwi<P extends dwh> {
   dwi<dwn> a = a("matching_blocks", dwn.a);
   dwi<dwm> b = a("matching_block_tag", dwm.e);
   dwi<dwo> c = a("matching_fluids", dwo.a);
   dwi<dwk> d = a("has_sturdy_face", dwk.a);
   dwi<dwr> e = a("solid", dwr.a);
   dwi<dwq> f = a("replaceable", dwq.a);
   dwi<dwu> g = a("would_survive", dwu.a);
   dwi<dwl> h = a("inside_world_bounds", dwl.a);
   dwi<dwg> i = a("any_of", dwg.a);
   dwi<dwf> j = a("all_of", dwf.a);
   dwi<dwp> k = a("not", dwp.a);
   dwi<dwt> l = a("true", dwt.e);

   Codec<P> codec();

   private static <P extends dwh> dwi<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.O, $$0, () -> $$1);
   }
}
