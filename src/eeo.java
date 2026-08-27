import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class eeo {
   public static Codec<? extends een> a(iy<Codec<? extends een>> $$0) {
      iy.a($$0, "random", eeq.a);
      iy.a($$0, "random_group", eer.a);
      return iy.a($$0, "direct", eem.a);
   }

   public static void a(pl<eel> $$0, il<eel> $$1, List<een> $$2) {
      $$2.stream().flatMap(een::a).map($$0x -> $$0x.a().a()).forEach($$2x -> ps.a($$0, $$2x, new eel($$1, List.of(Pair.of(eej.b($$2x), 1)), eel.a.b)));
   }
}
