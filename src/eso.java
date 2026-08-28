import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eso {
   public static MapCodec<? extends esn> a(jr<MapCodec<? extends esn>> $$0) {
      jr.a($$0, "random", esq.a);
      jr.a($$0, "random_group", esr.a);
      return jr.a($$0, "direct", esm.a);
   }

   public static void a(qh<esl> $$0, je<esl> $$1, List<esn> $$2) {
      $$2.stream().flatMap(esn::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qo.a($$0, $$2x, new esl($$1, List.of(Pair.of(esj.b($$2x), 1)), esl.a.b)));
   }
}
