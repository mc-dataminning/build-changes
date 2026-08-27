import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class eds {
   public static Codec<? extends edr> a(ix<Codec<? extends edr>> $$0) {
      ix.a($$0, "random", edu.a);
      ix.a($$0, "random_group", edv.a);
      return ix.a($$0, "direct", edq.a);
   }

   public static void a(pj<edp> $$0, il<edp> $$1, List<edr> $$2) {
      $$2.stream().flatMap(edr::a).map($$0x -> $$0x.a().a()).forEach($$2x -> pq.a($$0, $$2x, new edp($$1, List.of(Pair.of(edn.b($$2x), 1)), edp.a.b)));
   }
}
