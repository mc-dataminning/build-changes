import com.mojang.serialization.MapCodec;

public interface ejo<SP extends ejn> {
   ejo<ejl> a = a("random_spread", ejl.a);
   ejo<ejk> b = a("concentric_rings", ejk.a);

   MapCodec<SP> codec();

   private static <SP extends ejn> ejo<SP> a(String $$0, MapCodec<SP> $$1) {
      return jw.a(lq.P, $$0, () -> $$1);
   }
}
