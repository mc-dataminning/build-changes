import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.List;

public class eas {
   public static Codec<? extends ear> a(it<Codec<? extends ear>> $$0) {
      it.a($$0, "random", eau.a);
      it.a($$0, "random_group", eav.a);
      return it.a($$0, "direct", eaq.a);
   }

   public static void a(pe<eap> $$0, ih<eap> $$1, List<ear> $$2) {
      $$2.stream().flatMap(ear::a).map($$0x -> $$0x.a().a()).forEach($$2x -> pl.a($$0, $$2x, new eap($$1, List.of(Pair.of(ean.b($$2x), 1)), eap.a.b)));
   }
}
