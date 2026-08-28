import com.mojang.serialization.MapCodec;

public interface bpu<P extends bpt> {
   bpu<bpr> a = a("constant", bpr.b);
   bpu<bqa> b = a("uniform", bqa.a);
   bpu<bpp> c = a("clamped_normal", bpp.a);
   bpu<bpz> d = a("trapezoid", bpz.a);

   MapCodec<P> codec();

   static <P extends bpt> bpu<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.J, $$0, () -> $$1);
   }
}
