import com.mojang.serialization.MapCodec;

public interface bpz<P extends bpy> {
   bpz<bpw> a = a("constant", bpw.b);
   bpz<bqf> b = a("uniform", bqf.a);
   bpz<bpu> c = a("clamped_normal", bpu.a);
   bpz<bqe> d = a("trapezoid", bqe.a);

   MapCodec<P> codec();

   static <P extends bpy> bpz<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.L, $$0, () -> $$1);
   }
}
