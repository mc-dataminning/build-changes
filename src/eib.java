import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class eib {
   public static Codec<? extends eia> a(jj<Codec<? extends eia>> $$0) {
      jj.a($$0, "random", eid.a);
      jj.a($$0, "random_group", eie.a);
      return jj.a($$0, "direct", ehz.a);
   }

   public static void a(ql<ehy> $$0, iw<ehy> $$1, List<eia> $$2) {
      $$2.stream().flatMap(eia::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qs.a($$0, $$2x, new ehy($$1, List.of(Pair.of(ehw.b($$2x), 1)), ehy.a.b)));
   }
}
