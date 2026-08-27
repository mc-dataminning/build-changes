import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class ecx {
   public static Codec<? extends ecw> a(iv<Codec<? extends ecw>> $$0) {
      iv.a($$0, "random", ecz.a);
      iv.a($$0, "random_group", eda.a);
      return iv.a($$0, "direct", ecv.a);
   }

   public static void a(ph<ecu> $$0, ij<ecu> $$1, List<ecw> $$2) {
      $$2.stream().flatMap(ecw::a).map($$0x -> $$0x.a().a()).forEach($$2x -> po.a($$0, $$2x, new ecu($$1, List.of(Pair.of(ecs.b($$2x), 1)), ecu.a.b)));
   }
}
