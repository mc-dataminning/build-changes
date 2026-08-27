import com.mojang.serialization.MapCodec;

public interface bpa<P extends boz> {
   bpa<box> a = a("constant", box.b);
   bpa<bpg> b = a("uniform", bpg.a);
   bpa<bov> c = a("clamped_normal", bov.a);
   bpa<bpf> d = a("trapezoid", bpf.a);

   MapCodec<P> codec();

   static <P extends boz> bpa<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.L, $$0, () -> $$1);
   }
}
