import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eta {
   public static MapCodec<? extends esz> a(js<MapCodec<? extends esz>> $$0) {
      js.a($$0, "random", etd.a);
      js.a($$0, "random_group", etc.a);
      return js.a($$0, "direct", esy.a);
   }

   public static void a(qh<esx> $$0, jf<esx> $$1, List<esz> $$2) {
      $$2.stream().flatMap(esz::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qo.a($$0, $$2x, new esx($$1, List.of(Pair.of(esv.b($$2x), 1)), esx.a.b)));
   }
}
