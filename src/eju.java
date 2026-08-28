import com.mojang.serialization.MapCodec;

public interface eju<SP extends ejt> {
   eju<ejr> a = a("random_spread", ejr.a);
   eju<ejq> b = a("concentric_rings", ejq.a);

   MapCodec<SP> codec();

   private static <SP extends ejt> eju<SP> a(String $$0, MapCodec<SP> $$1) {
      return jw.a(lq.P, $$0, () -> $$1);
   }
}
