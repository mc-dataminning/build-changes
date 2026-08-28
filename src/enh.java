import com.mojang.serialization.MapCodec;

public interface enh<P extends eng> {
   enh<enf> a = a("always_true", enf.a);
   enh<enc> b = a("linear_pos", enc.a);
   enh<emr> c = a("axis_aligned_linear_pos", emr.a);

   MapCodec<P> codec();

   static <P extends eng> enh<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.o, $$0, () -> $$1);
   }
}
