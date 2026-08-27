import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class ecq {
   public static Codec<? extends ecp> a(iv<Codec<? extends ecp>> $$0) {
      iv.a($$0, "random", ecs.a);
      iv.a($$0, "random_group", ect.a);
      return iv.a($$0, "direct", eco.a);
   }

   public static void a(ph<ecn> $$0, ij<ecn> $$1, List<ecp> $$2) {
      $$2.stream().flatMap(ecp::a).map($$0x -> $$0x.a().a()).forEach($$2x -> po.a($$0, $$2x, new ecn($$1, List.of(Pair.of(ecl.b($$2x), 1)), ecn.a.b)));
   }
}
