import com.mojang.serialization.Codec;

public interface dlu<P extends dlt> {
   dlu<dlz> a = a("matching_blocks", dlz.a);
   dlu<dly> b = a("matching_block_tag", dly.e);
   dlu<dma> c = a("matching_fluids", dma.a);
   dlu<dlw> d = a("has_sturdy_face", dlw.a);
   dlu<dmd> e = a("solid", dmd.a);
   dlu<dmc> f = a("replaceable", dmc.a);
   dlu<dmg> g = a("would_survive", dmg.a);
   dlu<dlx> h = a("inside_world_bounds", dlx.a);
   dlu<dls> i = a("any_of", dls.a);
   dlu<dlr> j = a("all_of", dlr.a);
   dlu<dmb> k = a("not", dmb.a);
   dlu<dmf> l = a("true", dmf.e);

   Codec<P> codec();

   private static <P extends dlt> dlu<P> a(String $$0, Codec<P> $$1) {
      return hq.a(jb.P, $$0, () -> $$1);
   }
}
