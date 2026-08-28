import com.mojang.serialization.MapCodec;

public interface bqc<P extends bqb> {
   bqc<bpy> a = a("constant", bpy.b);
   bqc<bqh> b = a("uniform", bqh.a);
   bqc<bpt> c = a("biased_to_bottom", bpt.a);
   bqc<bpu> d = a("clamped", bpu.a);
   bqc<bqi> e = a("weighted_list", bqi.a);
   bqc<bpw> f = a("clamped_normal", bpw.a);

   MapCodec<P> codec();

   static <P extends bqb> bqc<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.M, $$0, () -> $$1);
   }
}
