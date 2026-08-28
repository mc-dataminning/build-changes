import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class epq {
   public static MapCodec<? extends epp> a(kd<MapCodec<? extends epp>> $$0) {
      kd.a($$0, "random", eps.a);
      kd.a($$0, "random_group", ept.a);
      return kd.a($$0, "direct", epo.a);
   }

   public static void a(ra<epn> $$0, jq<epn> $$1, List<epp> $$2) {
      $$2.stream().flatMap(epp::a).map($$0x -> $$0x.a().a()).forEach($$2x -> rh.a($$0, $$2x, new epn($$1, List.of(Pair.of(epl.b($$2x), 1)), epn.a.b)));
   }
}
