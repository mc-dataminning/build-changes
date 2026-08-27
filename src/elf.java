import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class elf {
   public static Codec<? extends ele> a(jn<Codec<? extends ele>> $$0) {
      jn.a($$0, "random", elh.a);
      jn.a($$0, "random_group", eli.a);
      return jn.a($$0, "direct", eld.a);
   }

   public static void a(qq<elc> $$0, ja<elc> $$1, List<ele> $$2) {
      $$2.stream().flatMap(ele::a).map($$0x -> $$0x.a().a()).forEach($$2x -> ra.a($$0, $$2x, new elc($$1, List.of(Pair.of(ela.b($$2x), 1)), elc.a.b)));
   }
}
