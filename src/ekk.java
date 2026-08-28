import com.mojang.serialization.MapCodec;

public interface ekk<SP extends ekj> {
   ekk<ekh> a = a("random_spread", ekh.a);
   ekk<ekg> b = a("concentric_rings", ekg.a);

   MapCodec<SP> codec();

   private static <SP extends ekj> ekk<SP> a(String $$0, MapCodec<SP> $$1) {
      return jz.a(lt.P, $$0, () -> $$1);
   }
}
