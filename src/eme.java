import com.mojang.serialization.MapCodec;

public interface eme<SP extends emd> {
   eme<emb> a = a("random_spread", emb.a);
   eme<ema> b = a("concentric_rings", ema.a);

   MapCodec<SP> codec();

   private static <SP extends emd> eme<SP> a(String $$0, MapCodec<SP> $$1) {
      return kb.a(lv.P, $$0, () -> $$1);
   }
}
