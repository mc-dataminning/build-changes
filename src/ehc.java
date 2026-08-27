import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class ehc {
   public static Codec<? extends ehb> a(ja<Codec<? extends ehb>> $$0) {
      ja.a($$0, "random", ehe.a);
      ja.a($$0, "random_group", ehf.a);
      return ja.a($$0, "direct", eha.a);
   }

   public static void a(pz<egz> $$0, in<egz> $$1, List<ehb> $$2) {
      $$2.stream().flatMap(ehb::a).map($$0x -> $$0x.a().a()).forEach($$2x -> qg.a($$0, $$2x, new egz($$1, List.of(Pair.of(egx.b($$2x), 1)), egz.a.b)));
   }
}
