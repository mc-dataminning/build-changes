import com.mojang.serialization.Codec;

public interface dvx<SP extends dvw> {
   dvx<dvu> a = a("random_spread", dvu.a);
   dvx<dvt> b = a("concentric_rings", dvt.a);

   Codec<SP> codec();

   private static <SP extends dvw> dvx<SP> a(String $$0, Codec<SP> $$1) {
      return hr.a(jb.S, $$0, () -> $$1);
   }
}
