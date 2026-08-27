import com.mojang.serialization.Codec;

public interface eec<SP extends eeb> {
   eec<edz> a = a("random_spread", edz.a);
   eec<edy> b = a("concentric_rings", edy.a);

   Codec<SP> codec();

   private static <SP extends eeb> eec<SP> a(String $$0, Codec<SP> $$1) {
      return iy.a(ki.R, $$0, () -> $$1);
   }
}
