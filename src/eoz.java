import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eoz {
   public static MapCodec<? extends eoy> a(ke<MapCodec<? extends eoy>> $$0) {
      ke.a($$0, "random", epb.a);
      ke.a($$0, "random_group", epc.a);
      return ke.a($$0, "direct", eox.a);
   }

   public static void a(qe<eow> $$0, jr<eow> $$1, List<eoy> $$2) {
      $$2.stream().flatMap(eoy::a).map($$0x -> $$0x.a().a()).forEach($$2x -> ql.a($$0, $$2x, new eow($$1, List.of(Pair.of(eou.b($$2x), 1)), eow.a.b)));
   }
}
