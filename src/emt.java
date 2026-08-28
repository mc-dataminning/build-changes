import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class emt {
   public static MapCodec<? extends ems> a(kb<MapCodec<? extends ems>> $$0) {
      kb.a($$0, "random", emv.a);
      kb.a($$0, "random_group", emw.a);
      return kb.a($$0, "direct", emr.a);
   }

   public static void a(qu<emq> $$0, jo<emq> $$1, List<ems> $$2) {
      $$2.stream().flatMap(ems::a).map($$0x -> $$0x.a().a()).forEach($$2x -> rb.a($$0, $$2x, new emq($$1, List.of(Pair.of(emo.b($$2x), 1)), emq.a.b)));
   }
}
