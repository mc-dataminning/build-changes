import com.mojang.serialization.MapCodec;

public interface eix<P extends eiw> {
   eix<ejc> a = a("matching_blocks", ejc.a);
   eix<ejb> b = a("matching_block_tag", ejb.e);
   eix<ejd> c = a("matching_fluids", ejd.a);
   eix<eiz> d = a("has_sturdy_face", eiz.a);
   eix<ejg> e = a("solid", ejg.a);
   eix<ejf> f = a("replaceable", ejf.a);
   eix<ejk> g = a("would_survive", ejk.a);
   eix<eja> h = a("inside_world_bounds", eja.a);
   eix<eiv> i = a("any_of", eiv.a);
   eix<eiu> j = a("all_of", eiu.a);
   eix<eje> k = a("not", eje.a);
   eix<eji> l = a("true", eji.e);
   eix<ejj> m = a("unobstructed", ejj.a);

   MapCodec<P> codec();

   private static <P extends eiw> eix<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.M, $$0, () -> $$1);
   }
}
