import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ekc {
   public static MapCodec<? extends ekb> a(jw<MapCodec<? extends ekb>> $$0) {
      jw.a($$0, "random", eke.a);
      jw.a($$0, "random_group", ekf.a);
      return jw.a($$0, "direct", eka.a);
   }

   public static void a(qm<ejz> $$0, jj<ejz> $$1, List<ekb> $$2) {
      $$2.stream().flatMap(ekb::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qt.a($$0, $$2x, new ejz($$1, List.of(Pair.of(ejx.b($$2x), 1)), ejz.a.b)));
   }
}
