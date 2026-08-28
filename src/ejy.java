import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ejy {
   public static MapCodec<? extends ejx> a(jv<MapCodec<? extends ejx>> $$0) {
      jv.a($$0, "random", eka.a);
      jv.a($$0, "random_group", ekb.a);
      return jv.a($$0, "direct", ejw.a);
   }

   public static void a(rc<ejv> $$0, ji<ejv> $$1, List<ejx> $$2) {
      $$2.stream().flatMap(ejx::a).map($$0x -> $$0x.a().a()).forEach($$2x -> rj.a($$0, $$2x, new ejv($$1, List.of(Pair.of(ejt.b($$2x), 1)), ejv.a.b)));
   }
}
