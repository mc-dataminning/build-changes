import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ejv {
   public static MapCodec<? extends eju> a(jv<MapCodec<? extends eju>> $$0) {
      jv.a($$0, "random", ejx.a);
      jv.a($$0, "random_group", ejy.a);
      return jv.a($$0, "direct", ejt.a);
   }

   public static void a(rc<ejs> $$0, ji<ejs> $$1, List<eju> $$2) {
      $$2.stream().flatMap(eju::a).map($$0x -> $$0x.a().a()).forEach($$2x -> rj.a($$0, $$2x, new ejs($$1, List.of(Pair.of(ejq.b($$2x), 1)), ejs.a.b)));
   }
}
