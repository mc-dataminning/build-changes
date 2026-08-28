import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eju {
   public static MapCodec<? extends ejt> a(jv<MapCodec<? extends ejt>> $$0) {
      jv.a($$0, "random", ejw.a);
      jv.a($$0, "random_group", ejx.a);
      return jv.a($$0, "direct", ejs.a);
   }

   public static void a(rc<ejr> $$0, ji<ejr> $$1, List<ejt> $$2) {
      $$2.stream().flatMap(ejt::a).map($$0x -> $$0x.a().a()).forEach($$2x -> rj.a($$0, $$2x, new ejr($$1, List.of(Pair.of(ejp.b($$2x), 1)), ejr.a.b)));
   }
}
