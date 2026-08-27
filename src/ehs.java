import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class ehs {
   public static Codec<? extends ehr> a(ji<Codec<? extends ehr>> $$0) {
      ji.a($$0, "random", ehu.a);
      ji.a($$0, "random_group", ehv.a);
      return ji.a($$0, "direct", ehq.a);
   }

   public static void a(qj<ehp> $$0, iv<ehp> $$1, List<ehr> $$2) {
      $$2.stream().flatMap(ehr::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qq.a($$0, $$2x, new ehp($$1, List.of(Pair.of(ehn.b($$2x), 1)), ehp.a.b)));
   }
}
