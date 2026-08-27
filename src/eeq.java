import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class eeq {
   public static Codec<? extends eep> a(iy<Codec<? extends eep>> $$0) {
      iy.a($$0, "random", ees.a);
      iy.a($$0, "random_group", eet.a);
      return iy.a($$0, "direct", eeo.a);
   }

   public static void a(pl<een> $$0, il<een> $$1, List<eep> $$2) {
      $$2.stream().flatMap(eep::a).map($$0x -> $$0x.a().a()).forEach($$2x -> ps.a($$0, $$2x, new een($$1, List.of(Pair.of(eel.b($$2x), 1)), een.a.b)));
   }
}
