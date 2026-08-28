import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class esg {
   public static MapCodec<? extends esf> a(jr<MapCodec<? extends esf>> $$0) {
      jr.a($$0, "random", esi.a);
      jr.a($$0, "random_group", esj.a);
      return jr.a($$0, "direct", ese.a);
   }

   public static void a(qh<esd> $$0, je<esd> $$1, List<esf> $$2) {
      $$2.stream().flatMap(esf::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qo.a($$0, $$2x, new esd($$1, List.of(Pair.of(esb.b($$2x), 1)), esd.a.b)));
   }
}
