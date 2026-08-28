import com.mojang.serialization.MapCodec;

public interface emm<P extends eml> {
   emm<emk> a = a("always_true", emk.a);
   emm<emi> b = a("linear_pos", emi.a);
   emm<elx> c = a("axis_aligned_linear_pos", elx.a);

   MapCodec<P> codec();

   static <P extends eml> emm<P> a(String $$0, MapCodec<P> $$1) {
      return jw.a(lq.o, $$0, () -> $$1);
   }
}
