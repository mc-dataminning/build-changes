import com.mojang.serialization.Codec;

public interface dlr<P extends dlq> {
   dlr<dlw> a = a("matching_blocks", dlw.a);
   dlr<dlv> b = a("matching_block_tag", dlv.e);
   dlr<dlx> c = a("matching_fluids", dlx.a);
   dlr<dlt> d = a("has_sturdy_face", dlt.a);
   dlr<dma> e = a("solid", dma.a);
   dlr<dlz> f = a("replaceable", dlz.a);
   dlr<dmd> g = a("would_survive", dmd.a);
   dlr<dlu> h = a("inside_world_bounds", dlu.a);
   dlr<dlp> i = a("any_of", dlp.a);
   dlr<dlo> j = a("all_of", dlo.a);
   dlr<dly> k = a("not", dly.a);
   dlr<dmc> l = a("true", dmc.e);

   Codec<P> codec();

   private static <P extends dlq> dlr<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.P, $$0, () -> $$1);
   }
}
