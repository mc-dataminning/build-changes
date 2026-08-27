import com.mojang.serialization.Codec;

public interface dlq<P extends dlp> {
   dlq<dlv> a = a("matching_blocks", dlv.a);
   dlq<dlu> b = a("matching_block_tag", dlu.e);
   dlq<dlw> c = a("matching_fluids", dlw.a);
   dlq<dls> d = a("has_sturdy_face", dls.a);
   dlq<dlz> e = a("solid", dlz.a);
   dlq<dly> f = a("replaceable", dly.a);
   dlq<dmc> g = a("would_survive", dmc.a);
   dlq<dlt> h = a("inside_world_bounds", dlt.a);
   dlq<dlo> i = a("any_of", dlo.a);
   dlq<dln> j = a("all_of", dln.a);
   dlq<dlx> k = a("not", dlx.a);
   dlq<dmb> l = a("true", dmb.e);

   Codec<P> codec();

   private static <P extends dlp> dlq<P> a(String $$0, Codec<P> $$1) {
      return hr.a(jb.P, $$0, () -> $$1);
   }
}
