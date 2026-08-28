import com.mojang.serialization.MapCodec;

public interface brp<P extends bro> {
   brp<brm> a = a("constant", brm.b);
   brp<brv> b = a("uniform", brv.a);
   brp<brk> c = a("clamped_normal", brk.a);
   brp<bru> d = a("trapezoid", bru.a);

   MapCodec<P> codec();

   static <P extends bro> brp<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.J, $$0, () -> $$1);
   }
}
