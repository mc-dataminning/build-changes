import com.mojang.serialization.MapCodec;

public interface bpy<P extends bpx> {
   bpy<bpv> a = a("constant", bpv.b);
   bpy<bqe> b = a("uniform", bqe.a);
   bpy<bpt> c = a("clamped_normal", bpt.a);
   bpy<bqd> d = a("trapezoid", bqd.a);

   MapCodec<P> codec();

   static <P extends bpx> bpy<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.L, $$0, () -> $$1);
   }
}
