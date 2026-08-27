import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class eba {
   public static Codec<? extends eaz> a(it<Codec<? extends eaz>> $$0) {
      it.a($$0, "random", ebc.a);
      it.a($$0, "random_group", ebd.a);
      return it.a($$0, "direct", eay.a);
   }

   public static void a(pf<eax> $$0, ih<eax> $$1, List<eaz> $$2) {
      $$2.stream().flatMap(eaz::a).map($$0x -> $$0x.a().a()).forEach($$2x -> pm.a($$0, $$2x, new eax($$1, List.of(Pair.of(eav.b($$2x), 1)), eax.a.b)));
   }
}
