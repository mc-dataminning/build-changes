import com.mojang.serialization.MapCodec;

public interface euj<P extends eui> {
   euj<euh> a = a("always_true", euh.a);
   euj<eue> b = a("linear_pos", eue.a);
   euj<ett> c = a("axis_aligned_linear_pos", ett.a);

   MapCodec<P> codec();

   static <P extends eui> euj<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.o, $$0, () -> $$1);
   }
}
