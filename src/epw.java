import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class epw {
   public static MapCodec<? extends epv> a(kd<MapCodec<? extends epv>> $$0) {
      kd.a($$0, "random", epy.a);
      kd.a($$0, "random_group", epz.a);
      return kd.a($$0, "direct", epu.a);
   }

   public static void a(rk<ept> $$0, jq<ept> $$1, List<epv> $$2) {
      $$2.stream().flatMap(epv::a).map($$0x -> $$0x.a().a()).forEach($$2x -> rr.a($$0, $$2x, new ept($$1, List.of(Pair.of(epr.b($$2x), 1)), ept.a.b)));
   }
}
