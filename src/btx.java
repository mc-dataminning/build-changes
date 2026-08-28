import com.mojang.serialization.MapCodec;

public interface btx<P extends btw> {
   btx<btu> a = a("constant", btu.b);
   btx<bud> b = a("uniform", bud.a);
   btx<bts> c = a("clamped_normal", bts.a);
   btx<buc> d = a("trapezoid", buc.a);

   MapCodec<P> codec();

   static <P extends btw> btx<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.J, $$0, () -> $$1);
   }
}
