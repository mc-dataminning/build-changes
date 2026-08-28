import com.mojang.serialization.MapCodec;

public interface bpt<P extends bps> {
   bpt<bpq> a = a("constant", bpq.b);
   bpt<bpz> b = a("uniform", bpz.a);
   bpt<bpo> c = a("clamped_normal", bpo.a);
   bpt<bpy> d = a("trapezoid", bpy.a);

   MapCodec<P> codec();

   static <P extends bps> bpt<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.L, $$0, () -> $$1);
   }
}
