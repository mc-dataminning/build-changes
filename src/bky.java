import com.mojang.serialization.Codec;

public interface bky<P extends bkx> {
   bky<bkv> a = a("constant", bkv.b);
   bky<ble> b = a("uniform", ble.a);
   bky<bkt> c = a("clamped_normal", bkt.a);
   bky<bld> d = a("trapezoid", bld.a);

   Codec<P> codec();

   static <P extends bkx> bky<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.L, $$0, () -> $$1);
   }
}
