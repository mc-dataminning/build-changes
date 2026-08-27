import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eiv {
   public static MapCodec<? extends eiu> a(jk<MapCodec<? extends eiu>> $$0) {
      jk.a($$0, "random", eix.a);
      jk.a($$0, "random_group", eiy.a);
      return jk.a($$0, "direct", eit.a);
   }

   public static void a(qo<eis> $$0, ix<eis> $$1, List<eiu> $$2) {
      $$2.stream().flatMap(eiu::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qv.a($$0, $$2x, new eis($$1, List.of(Pair.of(eiq.b($$2x), 1)), eis.a.b)));
   }
}
