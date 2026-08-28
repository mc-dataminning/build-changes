import com.mojang.serialization.MapCodec;

public interface ejk<SP extends ejj> {
   ejk<ejh> a = a("random_spread", ejh.a);
   ejk<ejg> b = a("concentric_rings", ejg.a);

   MapCodec<SP> codec();

   private static <SP extends ejj> ejk<SP> a(String $$0, MapCodec<SP> $$1) {
      return jv.a(lp.R, $$0, () -> $$1);
   }
}
