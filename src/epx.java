import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class epx {
   public static MapCodec<? extends epw> a(kd<MapCodec<? extends epw>> $$0) {
      kd.a($$0, "random", epz.a);
      kd.a($$0, "random_group", eqa.a);
      return kd.a($$0, "direct", epv.a);
   }

   public static void a(rk<epu> $$0, jq<epu> $$1, List<epw> $$2) {
      $$2.stream().flatMap(epw::a).map($$0x -> $$0x.a().a()).forEach($$2x -> rr.a($$0, $$2x, new epu($$1, List.of(Pair.of(eps.b($$2x), 1)), epu.a.b)));
   }
}
