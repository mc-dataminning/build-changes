import com.mojang.serialization.Codec;

public interface dsy<P extends dsx> {
   dsy<dtd> a = a("matching_blocks", dtd.a);
   dsy<dtc> b = a("matching_block_tag", dtc.e);
   dsy<dte> c = a("matching_fluids", dte.a);
   dsy<dta> d = a("has_sturdy_face", dta.a);
   dsy<dth> e = a("solid", dth.a);
   dsy<dtg> f = a("replaceable", dtg.a);
   dsy<dtk> g = a("would_survive", dtk.a);
   dsy<dtb> h = a("inside_world_bounds", dtb.a);
   dsy<dsw> i = a("any_of", dsw.a);
   dsy<dsv> j = a("all_of", dsv.a);
   dsy<dtf> k = a("not", dtf.a);
   dsy<dtj> l = a("true", dtj.e);

   Codec<P> codec();

   private static <P extends dsx> dsy<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.O, $$0, () -> $$1);
   }
}
