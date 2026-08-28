import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ele {
   public static MapCodec<? extends eld> a(jz<MapCodec<? extends eld>> $$0) {
      jz.a($$0, "random", elg.a);
      jz.a($$0, "random_group", elh.a);
      return jz.a($$0, "direct", elc.a);
   }

   public static void a(qq<elb> $$0, jm<elb> $$1, List<eld> $$2) {
      $$2.stream().flatMap(eld::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qx.a($$0, $$2x, new elb($$1, List.of(Pair.of(ekz.b($$2x), 1)), elb.a.b)));
   }
}
