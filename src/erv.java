import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class erv {
   public static MapCodec<? extends eru> a(jr<MapCodec<? extends eru>> $$0) {
      jr.a($$0, "random", erx.a);
      jr.a($$0, "random_group", ery.a);
      return jr.a($$0, "direct", ert.a);
   }

   public static void a(qh<ers> $$0, je<ers> $$1, List<eru> $$2) {
      $$2.stream().flatMap(eru::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qo.a($$0, $$2x, new ers($$1, List.of(Pair.of(erq.b($$2x), 1)), ers.a.b)));
   }
}
