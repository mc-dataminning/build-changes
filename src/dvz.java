import com.mojang.serialization.Codec;

public interface dvz<P extends dvy> {
   dvz<dwe> a = a("matching_blocks", dwe.a);
   dvz<dwd> b = a("matching_block_tag", dwd.e);
   dvz<dwf> c = a("matching_fluids", dwf.a);
   dvz<dwb> d = a("has_sturdy_face", dwb.a);
   dvz<dwi> e = a("solid", dwi.a);
   dvz<dwh> f = a("replaceable", dwh.a);
   dvz<dwl> g = a("would_survive", dwl.a);
   dvz<dwc> h = a("inside_world_bounds", dwc.a);
   dvz<dvx> i = a("any_of", dvx.a);
   dvz<dvw> j = a("all_of", dvw.a);
   dvz<dwg> k = a("not", dwg.a);
   dvz<dwk> l = a("true", dwk.e);

   Codec<P> codec();

   private static <P extends dvy> dvz<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.O, $$0, () -> $$1);
   }
}
