import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class egt {
   public static Codec<? extends egs> a(iy<Codec<? extends egs>> $$0) {
      iy.a($$0, "random", egv.a);
      iy.a($$0, "random_group", egw.a);
      return iy.a($$0, "direct", egr.a);
   }

   public static void a(px<egq> $$0, il<egq> $$1, List<egs> $$2) {
      $$2.stream().flatMap(egs::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qe.a($$0, $$2x, new egq($$1, List.of(Pair.of(ego.b($$2x), 1)), egq.a.b)));
   }
}
