import com.mojang.serialization.MapCodec;

public interface bpy<P extends bpx> {
   bpy<bpu> a = a("constant", bpu.b);
   bpy<bqd> b = a("uniform", bqd.a);
   bpy<bpp> c = a("biased_to_bottom", bpp.a);
   bpy<bpq> d = a("clamped", bpq.a);
   bpy<bqe> e = a("weighted_list", bqe.a);
   bpy<bps> f = a("clamped_normal", bps.a);

   MapCodec<P> codec();

   static <P extends bpx> bpy<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.M, $$0, () -> $$1);
   }
}
