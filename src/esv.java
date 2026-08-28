import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class esv {
   public static MapCodec<? extends esu> a(js<MapCodec<? extends esu>> $$0) {
      js.a($$0, "random", esy.a);
      js.a($$0, "random_group", esx.a);
      return js.a($$0, "direct", est.a);
   }

   public static void a(qh<ess> $$0, jf<ess> $$1, List<esu> $$2) {
      $$2.stream().flatMap(esu::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qo.a($$0, $$2x, new ess($$1, List.of(Pair.of(esq.b($$2x), 1)), ess.a.b)));
   }
}
