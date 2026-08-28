import com.mojang.serialization.MapCodec;

public interface ejg<SP extends ejf> {
   ejg<ejd> a = a("random_spread", ejd.a);
   ejg<ejc> b = a("concentric_rings", ejc.a);

   MapCodec<SP> codec();

   private static <SP extends ejf> ejg<SP> a(String $$0, MapCodec<SP> $$1) {
      return jv.a(lp.R, $$0, () -> $$1);
   }
}
