import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class etq {
   public static MapCodec<? extends etp> a(jt<MapCodec<? extends etp>> $$0) {
      jt.a($$0, "random", ett.a);
      jt.a($$0, "random_group", ets.a);
      return jt.a($$0, "direct", eto.a);
   }

   public static void a(qi<etn> $$0, jg<etn> $$1, List<etp> $$2) {
      $$2.stream().flatMap(etp::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qp.a($$0, $$2x, new etn($$1, List.of(Pair.of(etl.b($$2x), 1)), etn.a.b)));
   }
}
