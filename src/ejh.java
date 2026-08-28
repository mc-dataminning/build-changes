import com.mojang.serialization.MapCodec;

public interface ejh<SP extends ejg> {
   ejh<eje> a = a("random_spread", eje.a);
   ejh<ejd> b = a("concentric_rings", ejd.a);

   MapCodec<SP> codec();

   private static <SP extends ejg> ejh<SP> a(String $$0, MapCodec<SP> $$1) {
      return jv.a(lp.R, $$0, () -> $$1);
   }
}
