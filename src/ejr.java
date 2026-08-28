import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ejr {
   public static MapCodec<? extends ejq> a(jv<MapCodec<? extends ejq>> $$0) {
      jv.a($$0, "random", ejt.a);
      jv.a($$0, "random_group", eju.a);
      return jv.a($$0, "direct", ejp.a);
   }

   public static void a(rc<ejo> $$0, ji<ejo> $$1, List<ejq> $$2) {
      $$2.stream().flatMap(ejq::a).map($$0x -> $$0x.a().a()).forEach($$2x -> rj.a($$0, $$2x, new ejo($$1, List.of(Pair.of(ejm.b($$2x), 1)), ejo.a.b)));
   }
}
