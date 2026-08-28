import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eto {
   public static MapCodec<? extends etn> a(js<MapCodec<? extends etn>> $$0) {
      js.a($$0, "random", etr.a);
      js.a($$0, "random_group", etq.a);
      return js.a($$0, "direct", etm.a);
   }

   public static void a(qh<etl> $$0, jf<etl> $$1, List<etn> $$2) {
      $$2.stream().flatMap(etn::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qo.a($$0, $$2x, new etl($$1, List.of(Pair.of(etj.b($$2x), 1)), etl.a.b)));
   }
}
