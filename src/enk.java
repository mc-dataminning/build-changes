import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class enk {
   public static MapCodec<? extends enj> a(kd<MapCodec<? extends enj>> $$0) {
      kd.a($$0, "random", enm.a);
      kd.a($$0, "random_group", enn.a);
      return kd.a($$0, "direct", eni.a);
   }

   public static void a(qy<enh> $$0, jq<enh> $$1, List<enj> $$2) {
      $$2.stream().flatMap(enj::a).map($$0x -> $$0x.a().a()).forEach($$2x -> rf.a($$0, $$2x, new enh($$1, List.of(Pair.of(enf.b($$2x), 1)), enh.a.b)));
   }
}
