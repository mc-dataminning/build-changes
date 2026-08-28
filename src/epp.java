import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class epp {
   public static MapCodec<? extends epo> a(kd<MapCodec<? extends epo>> $$0) {
      kd.a($$0, "random", epr.a);
      kd.a($$0, "random_group", eps.a);
      return kd.a($$0, "direct", epn.a);
   }

   public static void a(rk<epm> $$0, jq<epm> $$1, List<epo> $$2) {
      $$2.stream().flatMap(epo::a).map($$0x -> $$0x.a().a()).forEach($$2x -> rr.a($$0, $$2x, new epm($$1, List.of(Pair.of(epk.b($$2x), 1)), epm.a.b)));
   }
}
