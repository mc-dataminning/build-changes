import com.mojang.serialization.Codec;

public interface dlp<P extends dlo> {
   dlp<dlu> a = a("matching_blocks", dlu.a);
   dlp<dlt> b = a("matching_block_tag", dlt.e);
   dlp<dlv> c = a("matching_fluids", dlv.a);
   dlp<dlr> d = a("has_sturdy_face", dlr.a);
   dlp<dly> e = a("solid", dly.a);
   dlp<dlx> f = a("replaceable", dlx.a);
   dlp<dmb> g = a("would_survive", dmb.a);
   dlp<dls> h = a("inside_world_bounds", dls.a);
   dlp<dln> i = a("any_of", dln.a);
   dlp<dlm> j = a("all_of", dlm.a);
   dlp<dlw> k = a("not", dlw.a);
   dlp<dma> l = a("true", dma.e);

   Codec<P> codec();

   private static <P extends dlo> dlp<P> a(String $$0, Codec<P> $$1) {
      return hs.a(jc.P, $$0, () -> $$1);
   }
}
