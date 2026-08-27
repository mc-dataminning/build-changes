import com.mojang.serialization.Codec;

public interface dlv<P extends dlu> {
   dlv<dma> a = a("matching_blocks", dma.a);
   dlv<dlz> b = a("matching_block_tag", dlz.e);
   dlv<dmb> c = a("matching_fluids", dmb.a);
   dlv<dlx> d = a("has_sturdy_face", dlx.a);
   dlv<dme> e = a("solid", dme.a);
   dlv<dmd> f = a("replaceable", dmd.a);
   dlv<dmh> g = a("would_survive", dmh.a);
   dlv<dly> h = a("inside_world_bounds", dly.a);
   dlv<dlt> i = a("any_of", dlt.a);
   dlv<dls> j = a("all_of", dls.a);
   dlv<dmc> k = a("not", dmc.a);
   dlv<dmg> l = a("true", dmg.e);

   Codec<P> codec();

   private static <P extends dlu> dlv<P> a(String $$0, Codec<P> $$1) {
      return ht.a(jd.P, $$0, () -> $$1);
   }
}
