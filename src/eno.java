import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eno {
   public static MapCodec<? extends enn> a(kd<MapCodec<? extends enn>> $$0) {
      kd.a($$0, "random", enq.a);
      kd.a($$0, "random_group", enr.a);
      return kd.a($$0, "direct", enm.a);
   }

   public static void a(rb<enl> $$0, jq<enl> $$1, List<enn> $$2) {
      $$2.stream().flatMap(enn::a).map($$0x -> $$0x.a().a()).forEach($$2x -> ri.a($$0, $$2x, new enl($$1, List.of(Pair.of(enj.b($$2x), 1)), enl.a.b)));
   }
}
