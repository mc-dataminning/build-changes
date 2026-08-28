import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ekz {
   public static MapCodec<? extends eky> a(jz<MapCodec<? extends eky>> $$0) {
      jz.a($$0, "random", elb.a);
      jz.a($$0, "random_group", elc.a);
      return jz.a($$0, "direct", ekx.a);
   }

   public static void a(qp<ekw> $$0, jm<ekw> $$1, List<eky> $$2) {
      $$2.stream().flatMap(eky::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qw.a($$0, $$2x, new ekw($$1, List.of(Pair.of(eku.b($$2x), 1)), ekw.a.b)));
   }
}
