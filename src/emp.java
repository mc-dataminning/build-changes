import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class emp {
   public static MapCodec<? extends emo> a(ka<MapCodec<? extends emo>> $$0) {
      ka.a($$0, "random", emr.a);
      ka.a($$0, "random_group", ems.a);
      return ka.a($$0, "direct", emn.a);
   }

   public static void a(qt<emm> $$0, jn<emm> $$1, List<emo> $$2) {
      $$2.stream().flatMap(emo::a).map($$0x -> $$0x.a().a()).forEach($$2x -> ra.a($$0, $$2x, new emm($$1, List.of(Pair.of(emk.b($$2x), 1)), emm.a.b)));
   }
}
