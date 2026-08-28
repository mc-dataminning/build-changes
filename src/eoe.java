import com.mojang.serialization.MapCodec;

public interface eoe<P extends eod> {
   eoe<eoc> a = a("always_true", eoc.a);
   eoe<enz> b = a("linear_pos", enz.a);
   eoe<eno> c = a("axis_aligned_linear_pos", eno.a);

   MapCodec<P> codec();

   static <P extends eod> eoe<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.o, $$0, () -> $$1);
   }
}
