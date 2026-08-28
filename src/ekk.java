import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ekk {
   public static MapCodec<? extends ekj> a(jw<MapCodec<? extends ekj>> $$0) {
      jw.a($$0, "random", ekm.a);
      jw.a($$0, "random_group", ekn.a);
      return jw.a($$0, "direct", eki.a);
   }

   public static void a(qm<ekh> $$0, jj<ekh> $$1, List<ekj> $$2) {
      $$2.stream().flatMap(ekj::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qt.a($$0, $$2x, new ekh($$1, List.of(Pair.of(ekf.b($$2x), 1)), ekh.a.b)));
   }
}
