import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class epa {
   public static MapCodec<? extends eoz> a(ke<MapCodec<? extends eoz>> $$0) {
      ke.a($$0, "random", epc.a);
      ke.a($$0, "random_group", epd.a);
      return ke.a($$0, "direct", eoy.a);
   }

   public static void a(qe<eox> $$0, jr<eox> $$1, List<eoz> $$2) {
      $$2.stream().flatMap(eoz::a).map($$0x -> $$0x.a().a()).forEach($$2x -> ql.a($$0, $$2x, new eox($$1, List.of(Pair.of(eov.b($$2x), 1)), eox.a.b)));
   }
}
