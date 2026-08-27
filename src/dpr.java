import com.mojang.serialization.Codec;

public interface dpr<P extends dpq> {
   dpr<dpw> a = a("matching_blocks", dpw.a);
   dpr<dpv> b = a("matching_block_tag", dpv.e);
   dpr<dpx> c = a("matching_fluids", dpx.a);
   dpr<dpt> d = a("has_sturdy_face", dpt.a);
   dpr<dqa> e = a("solid", dqa.a);
   dpr<dpz> f = a("replaceable", dpz.a);
   dpr<dqd> g = a("would_survive", dqd.a);
   dpr<dpu> h = a("inside_world_bounds", dpu.a);
   dpr<dpp> i = a("any_of", dpp.a);
   dpr<dpo> j = a("all_of", dpo.a);
   dpr<dpy> k = a("not", dpy.a);
   dpr<dqc> l = a("true", dqc.e);

   Codec<P> codec();

   private static <P extends dpq> dpr<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.O, $$0, () -> $$1);
   }
}
