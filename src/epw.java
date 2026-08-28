import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class epw {
   public static MapCodec<? extends epv> a(ke<MapCodec<? extends epv>> $$0) {
      ke.a($$0, "random", epy.a);
      ke.a($$0, "random_group", epz.a);
      return ke.a($$0, "direct", epu.a);
   }

   public static void a(qe<ept> $$0, jr<ept> $$1, List<epv> $$2) {
      $$2.stream().flatMap(epv::a).map($$0x -> $$0x.a().a()).forEach($$2x -> ql.a($$0, $$2x, new ept($$1, List.of(Pair.of(epr.b($$2x), 1)), ept.a.b)));
   }
}
