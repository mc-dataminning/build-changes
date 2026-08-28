import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class env {
   public static MapCodec<? extends enu> a(kd<MapCodec<? extends enu>> $$0) {
      kd.a($$0, "random", enx.a);
      kd.a($$0, "random_group", eny.a);
      return kd.a($$0, "direct", ent.a);
   }

   public static void a(qz<ens> $$0, jq<ens> $$1, List<enu> $$2) {
      $$2.stream().flatMap(enu::a).map($$0x -> $$0x.a().a()).forEach($$2x -> rg.a($$0, $$2x, new ens($$1, List.of(Pair.of(enq.b($$2x), 1)), ens.a.b)));
   }
}
