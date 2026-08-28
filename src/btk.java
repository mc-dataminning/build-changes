import com.mojang.serialization.MapCodec;

public interface btk<P extends btj> {
   btk<bth> a = a("constant", bth.b);
   btk<btq> b = a("uniform", btq.a);
   btk<btf> c = a("clamped_normal", btf.a);
   btk<btp> d = a("trapezoid", btp.a);

   MapCodec<P> codec();

   static <P extends btj> btk<P> a(String $$0, MapCodec<P> $$1) {
      return js.a(mg.J, $$0, () -> $$1);
   }
}
