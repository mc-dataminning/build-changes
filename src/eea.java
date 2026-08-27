import com.mojang.serialization.Codec;

public interface eea<SP extends edz> {
   eea<edx> a = a("random_spread", edx.a);
   eea<edw> b = a("concentric_rings", edw.a);

   Codec<SP> codec();

   private static <SP extends edz> eea<SP> a(String $$0, Codec<SP> $$1) {
      return iy.a(ki.R, $$0, () -> $$1);
   }
}
