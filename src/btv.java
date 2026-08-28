import com.mojang.serialization.MapCodec;

public interface btv<P extends btu> {
   btv<bts> a = a("constant", bts.b);
   btv<bub> b = a("uniform", bub.a);
   btv<btq> c = a("clamped_normal", btq.a);
   btv<bua> d = a("trapezoid", bua.a);

   MapCodec<P> codec();

   static <P extends btu> btv<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.J, $$0, () -> $$1);
   }
}
