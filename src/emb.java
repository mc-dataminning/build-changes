import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class emb {
   public static MapCodec<? extends ema> a(ka<MapCodec<? extends ema>> $$0) {
      ka.a($$0, "random", emd.a);
      ka.a($$0, "random_group", eme.a);
      return ka.a($$0, "direct", elz.a);
   }

   public static void a(qt<ely> $$0, jn<ely> $$1, List<ema> $$2) {
      $$2.stream().flatMap(ema::a).map($$0x -> $$0x.a().a()).forEach($$2x -> ra.a($$0, $$2x, new ely($$1, List.of(Pair.of(elw.b($$2x), 1)), ely.a.b)));
   }
}
