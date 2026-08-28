import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ene {
   public static MapCodec<? extends end> a(kc<MapCodec<? extends end>> $$0) {
      kc.a($$0, "random", eng.a);
      kc.a($$0, "random_group", enh.a);
      return kc.a($$0, "direct", enc.a);
   }

   public static void a(qx<enb> $$0, jp<enb> $$1, List<end> $$2) {
      $$2.stream().flatMap(end::a).map($$0x -> $$0x.a().a()).forEach($$2x -> re.a($$0, $$2x, new enb($$1, List.of(Pair.of(emz.b($$2x), 1)), enb.a.b)));
   }
}
