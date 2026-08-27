import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class eal {
   public static Codec<? extends eak> a(it<Codec<? extends eak>> $$0) {
      it.a($$0, "random", ean.a);
      it.a($$0, "random_group", eao.a);
      return it.a($$0, "direct", eaj.a);
   }

   public static void a(pc<eai> $$0, ih<eai> $$1, List<eak> $$2) {
      $$2.stream().flatMap(eak::a).map($$0x -> $$0x.a().a()).forEach($$2x -> pj.a($$0, $$2x, new eai($$1, List.of(Pair.of(eag.b($$2x), 1)), eai.a.b)));
   }
}
