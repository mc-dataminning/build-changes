import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class elc {
   public static MapCodec<? extends elb> a(jz<MapCodec<? extends elb>> $$0) {
      jz.a($$0, "random", ele.a);
      jz.a($$0, "random_group", elf.a);
      return jz.a($$0, "direct", ela.a);
   }

   public static void a(qq<ekz> $$0, jm<ekz> $$1, List<elb> $$2) {
      $$2.stream().flatMap(elb::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qx.a($$0, $$2x, new ekz($$1, List.of(Pair.of(ekx.b($$2x), 1)), ekz.a.b)));
   }
}
