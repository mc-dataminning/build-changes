import com.mojang.serialization.Codec;

public interface dxh<P extends dxg> {
   dxh<dxm> a = a("matching_blocks", dxm.a);
   dxh<dxl> b = a("matching_block_tag", dxl.e);
   dxh<dxn> c = a("matching_fluids", dxn.a);
   dxh<dxj> d = a("has_sturdy_face", dxj.a);
   dxh<dxq> e = a("solid", dxq.a);
   dxh<dxp> f = a("replaceable", dxp.a);
   dxh<dxt> g = a("would_survive", dxt.a);
   dxh<dxk> h = a("inside_world_bounds", dxk.a);
   dxh<dxf> i = a("any_of", dxf.a);
   dxh<dxe> j = a("all_of", dxe.a);
   dxh<dxo> k = a("not", dxo.a);
   dxh<dxs> l = a("true", dxs.e);

   Codec<P> codec();

   private static <P extends dxg> dxh<P> a(String $$0, Codec<P> $$1) {
      return jj.a(ld.O, $$0, () -> $$1);
   }
}
