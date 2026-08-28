import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eox {
   public static MapCodec<? extends eow> a(ke<MapCodec<? extends eow>> $$0) {
      ke.a($$0, "random", eoz.a);
      ke.a($$0, "random_group", epa.a);
      return ke.a($$0, "direct", eov.a);
   }

   public static void a(qe<eou> $$0, jr<eou> $$1, List<eow> $$2) {
      $$2.stream().flatMap(eow::a).map($$0x -> $$0x.a().a()).forEach($$2x -> ql.a($$0, $$2x, new eou($$1, List.of(Pair.of(eos.b($$2x), 1)), eou.a.b)));
   }
}
