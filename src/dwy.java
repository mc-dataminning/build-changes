import com.mojang.serialization.Codec;

public interface dwy<SP extends dwx> {
   dwy<dwv> a = a("random_spread", dwv.a);
   dwy<dwu> b = a("concentric_rings", dwu.a);

   Codec<SP> codec();

   private static <SP extends dwx> dwy<SP> a(String $$0, Codec<SP> $$1) {
      return io.a(jy.S, $$0, () -> $$1);
   }
}
