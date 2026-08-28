import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eqt {
   public static MapCodec<? extends eqs> a(kf<MapCodec<? extends eqs>> $$0) {
      kf.a($$0, "random", eqv.a);
      kf.a($$0, "random_group", eqw.a);
      return kf.a($$0, "direct", eqr.a);
   }

   public static void a(qg<eqq> $$0, js<eqq> $$1, List<eqs> $$2) {
      $$2.stream().flatMap(eqs::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qn.a($$0, $$2x, new eqq($$1, List.of(Pair.of(eqo.b($$2x), 1)), eqq.a.b)));
   }
}
