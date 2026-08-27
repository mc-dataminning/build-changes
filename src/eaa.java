import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class eaa {
   public static Codec<? extends dzz> a(ir<Codec<? extends dzz>> $$0) {
      ir.a($$0, "random", eac.a);
      ir.a($$0, "random_group", ead.a);
      return ir.a($$0, "direct", dzy.a);
   }

   public static void a(pa<dzx> $$0, ie<dzx> $$1, List<dzz> $$2) {
      $$2.stream().flatMap(dzz::a).map($$0x -> $$0x.a().a()).forEach($$2x -> ph.a($$0, $$2x, new dzx($$1, List.of(Pair.of(dzv.b($$2x), 1)), dzx.a.b)));
   }
}
