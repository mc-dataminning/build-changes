import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ejw {
   public static MapCodec<? extends ejv> a(jv<MapCodec<? extends ejv>> $$0) {
      jv.a($$0, "random", ejy.a);
      jv.a($$0, "random_group", ejz.a);
      return jv.a($$0, "direct", eju.a);
   }

   public static void a(rc<ejt> $$0, ji<ejt> $$1, List<ejv> $$2) {
      $$2.stream().flatMap(ejv::a).map($$0x -> $$0x.a().a()).forEach($$2x -> rj.a($$0, $$2x, new ejt($$1, List.of(Pair.of(ejr.b($$2x), 1)), ejt.a.b)));
   }
}
