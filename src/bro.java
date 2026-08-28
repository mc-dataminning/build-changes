import com.mojang.serialization.MapCodec;

public interface bro<P extends brn> {
   bro<brl> a = a("constant", brl.b);
   bro<bru> b = a("uniform", bru.a);
   bro<brj> c = a("clamped_normal", brj.a);
   bro<brt> d = a("trapezoid", brt.a);

   MapCodec<P> codec();

   static <P extends brn> bro<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.J, $$0, () -> $$1);
   }
}
