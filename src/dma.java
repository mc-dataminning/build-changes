import com.mojang.serialization.Codec;

public interface dma<P extends dlz> {
   dma<dmf> a = a("matching_blocks", dmf.a);
   dma<dme> b = a("matching_block_tag", dme.e);
   dma<dmg> c = a("matching_fluids", dmg.a);
   dma<dmc> d = a("has_sturdy_face", dmc.a);
   dma<dmj> e = a("solid", dmj.a);
   dma<dmi> f = a("replaceable", dmi.a);
   dma<dmm> g = a("would_survive", dmm.a);
   dma<dmd> h = a("inside_world_bounds", dmd.a);
   dma<dly> i = a("any_of", dly.a);
   dma<dlx> j = a("all_of", dlx.a);
   dma<dmh> k = a("not", dmh.a);
   dma<dml> l = a("true", dml.e);

   Codec<P> codec();

   private static <P extends dlz> dma<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.P, $$0, () -> $$1);
   }
}
