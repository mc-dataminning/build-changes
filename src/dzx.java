import com.mojang.serialization.Codec;

public interface dzx<SP extends dzw> {
   dzx<dzu> a = a("random_spread", dzu.a);
   dzx<dzt> b = a("concentric_rings", dzt.a);

   Codec<SP> codec();

   private static <SP extends dzw> dzx<SP> a(String $$0, Codec<SP> $$1) {
      return it.a(kd.R, $$0, () -> $$1);
   }
}
