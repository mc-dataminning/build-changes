import com.mojang.serialization.MapCodec;

public interface btf<P extends bte> {
   btf<btc> a = a("constant", btc.b);
   btf<btl> b = a("uniform", btl.a);
   btf<bta> c = a("clamped_normal", bta.a);
   btf<btk> d = a("trapezoid", btk.a);

   MapCodec<P> codec();

   static <P extends bte> btf<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.J, $$0, () -> $$1);
   }
}
