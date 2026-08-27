import com.mojang.serialization.Codec;

public interface dwy<P extends dwx> {
   dwy<dxd> a = a("matching_blocks", dxd.a);
   dwy<dxc> b = a("matching_block_tag", dxc.e);
   dwy<dxe> c = a("matching_fluids", dxe.a);
   dwy<dxa> d = a("has_sturdy_face", dxa.a);
   dwy<dxh> e = a("solid", dxh.a);
   dwy<dxg> f = a("replaceable", dxg.a);
   dwy<dxk> g = a("would_survive", dxk.a);
   dwy<dxb> h = a("inside_world_bounds", dxb.a);
   dwy<dww> i = a("any_of", dww.a);
   dwy<dwv> j = a("all_of", dwv.a);
   dwy<dxf> k = a("not", dxf.a);
   dwy<dxj> l = a("true", dxj.e);

   Codec<P> codec();

   private static <P extends dwx> dwy<P> a(String $$0, Codec<P> $$1) {
      return ji.a(lc.O, $$0, () -> $$1);
   }
}
