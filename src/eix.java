import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eix {
   public static MapCodec<? extends eiw> a(jk<MapCodec<? extends eiw>> $$0) {
      jk.a($$0, "random", eiz.a);
      jk.a($$0, "random_group", eja.a);
      return jk.a($$0, "direct", eiv.a);
   }

   public static void a(qo<eiu> $$0, ix<eiu> $$1, List<eiw> $$2) {
      $$2.stream().flatMap(eiw::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qv.a($$0, $$2x, new eiu($$1, List.of(Pair.of(eis.b($$2x), 1)), eiu.a.b)));
   }
}
