import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eki {
   public static MapCodec<? extends ekh> a(jw<MapCodec<? extends ekh>> $$0) {
      jw.a($$0, "random", ekk.a);
      jw.a($$0, "random_group", ekl.a);
      return jw.a($$0, "direct", ekg.a);
   }

   public static void a(qm<ekf> $$0, jj<ekf> $$1, List<ekh> $$2) {
      $$2.stream().flatMap(ekh::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qt.a($$0, $$2x, new ekf($$1, List.of(Pair.of(ekd.b($$2x), 1)), ekf.a.b)));
   }
}
