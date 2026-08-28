import com.mojang.serialization.MapCodec;

public interface esl<SP extends esk> {
   esl<esi> a = a("random_spread", esi.a);
   esl<esh> b = a("concentric_rings", esh.a);

   MapCodec<SP> codec();

   private static <SP extends esk> esl<SP> a(String $$0, MapCodec<SP> $$1) {
      return js.a(mg.P, $$0, () -> $$1);
   }
}
