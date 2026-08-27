import com.mojang.serialization.Codec;

public interface dvw<SP extends dvv> {
   dvw<dvt> a = a("random_spread", dvt.a);
   dvw<dvs> b = a("concentric_rings", dvs.a);

   Codec<SP> codec();

   private static <SP extends dvv> dvw<SP> a(String $$0, Codec<SP> $$1) {
      return hr.a(jb.S, $$0, () -> $$1);
   }
}
