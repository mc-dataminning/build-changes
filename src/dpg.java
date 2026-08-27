import com.mojang.serialization.Codec;

public interface dpg<P extends dpf> {
   dpg<dpl> a = a("matching_blocks", dpl.a);
   dpg<dpk> b = a("matching_block_tag", dpk.e);
   dpg<dpm> c = a("matching_fluids", dpm.a);
   dpg<dpi> d = a("has_sturdy_face", dpi.a);
   dpg<dpp> e = a("solid", dpp.a);
   dpg<dpo> f = a("replaceable", dpo.a);
   dpg<dps> g = a("would_survive", dps.a);
   dpg<dpj> h = a("inside_world_bounds", dpj.a);
   dpg<dpe> i = a("any_of", dpe.a);
   dpg<dpd> j = a("all_of", dpd.a);
   dpg<dpn> k = a("not", dpn.a);
   dpg<dpr> l = a("true", dpr.e);

   Codec<P> codec();

   private static <P extends dpf> dpg<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.O, $$0, () -> $$1);
   }
}
