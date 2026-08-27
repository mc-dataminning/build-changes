import com.mojang.serialization.Codec;

public interface dwa<SP extends dvz> {
   dwa<dvx> a = a("random_spread", dvx.a);
   dwa<dvw> b = a("concentric_rings", dvw.a);

   Codec<SP> codec();

   private static <SP extends dvz> dwa<SP> a(String $$0, Codec<SP> $$1) {
      return hq.a(jb.S, $$0, () -> $$1);
   }
}
