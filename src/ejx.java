import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ejx {
   public static MapCodec<? extends ejw> a(jv<MapCodec<? extends ejw>> $$0) {
      jv.a($$0, "random", ejz.a);
      jv.a($$0, "random_group", eka.a);
      return jv.a($$0, "direct", ejv.a);
   }

   public static void a(rc<eju> $$0, ji<eju> $$1, List<ejw> $$2) {
      $$2.stream().flatMap(ejw::a).map($$0x -> $$0x.a().a()).forEach($$2x -> rj.a($$0, $$2x, new eju($$1, List.of(Pair.of(ejs.b($$2x), 1)), eju.a.b)));
   }
}
