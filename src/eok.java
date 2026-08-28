import com.mojang.serialization.MapCodec;

public interface eok<SP extends eoj> {
   eok<eoh> a = a("random_spread", eoh.a);
   eok<eog> b = a("concentric_rings", eog.a);

   MapCodec<SP> codec();

   private static <SP extends eoj> eok<SP> a(String $$0, MapCodec<SP> $$1) {
      return ke.a(mb.P, $$0, () -> $$1);
   }
}
