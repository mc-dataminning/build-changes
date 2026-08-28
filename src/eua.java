import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eua {
   public static MapCodec<? extends etz> a(jt<MapCodec<? extends etz>> $$0) {
      jt.a($$0, "random", eud.a);
      jt.a($$0, "random_group", euc.a);
      return jt.a($$0, "direct", ety.a);
   }

   public static void a(qi<etx> $$0, jg<etx> $$1, List<etz> $$2) {
      $$2.stream().flatMap(etz::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qp.a($$0, $$2x, new etx($$1, List.of(Pair.of(etv.b($$2x), 1)), etx.a.b)));
   }
}
