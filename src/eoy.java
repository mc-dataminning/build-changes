import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eoy {
   public static MapCodec<? extends eox> a(ke<MapCodec<? extends eox>> $$0) {
      ke.a($$0, "random", epa.a);
      ke.a($$0, "random_group", epb.a);
      return ke.a($$0, "direct", eow.a);
   }

   public static void a(qe<eov> $$0, jr<eov> $$1, List<eox> $$2) {
      $$2.stream().flatMap(eox::a).map($$0x -> $$0x.a().a()).forEach($$2x -> ql.a($$0, $$2x, new eov($$1, List.of(Pair.of(eot.b($$2x), 1)), eov.a.b)));
   }
}
