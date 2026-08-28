import com.mojang.serialization.MapCodec;

public interface bsm<P extends bsl> {
   bsm<bsj> a = a("constant", bsj.b);
   bsm<bss> b = a("uniform", bss.a);
   bsm<bsh> c = a("clamped_normal", bsh.a);
   bsm<bsr> d = a("trapezoid", bsr.a);

   MapCodec<P> codec();

   static <P extends bsl> bsm<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.J, $$0, () -> $$1);
   }
}
