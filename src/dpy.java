import com.mojang.serialization.Codec;

public interface dpy<P extends dpx> {
   dpy<dqd> a = a("matching_blocks", dqd.a);
   dpy<dqc> b = a("matching_block_tag", dqc.e);
   dpy<dqe> c = a("matching_fluids", dqe.a);
   dpy<dqa> d = a("has_sturdy_face", dqa.a);
   dpy<dqh> e = a("solid", dqh.a);
   dpy<dqg> f = a("replaceable", dqg.a);
   dpy<dqk> g = a("would_survive", dqk.a);
   dpy<dqb> h = a("inside_world_bounds", dqb.a);
   dpy<dpw> i = a("any_of", dpw.a);
   dpy<dpv> j = a("all_of", dpv.a);
   dpy<dqf> k = a("not", dqf.a);
   dpy<dqj> l = a("true", dqj.e);

   Codec<P> codec();

   private static <P extends dpx> dpy<P> a(String $$0, Codec<P> $$1) {
      return it.a(kd.O, $$0, () -> $$1);
   }
}
