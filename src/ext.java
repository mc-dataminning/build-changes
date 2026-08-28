import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ext extends exd {
   public static final MapCodec<ext> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  exc.e.a(czd.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayi.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ext::new)
   );
   public static final cze b = new cze(0, List.of());
   private final Optional<exc.e<czd>> c;
   private final Optional<Integer> d;

   protected ext(List<eyz> $$0, Optional<exc.e<czd>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwo a(cwo $$0, evq $$1) {
      $$0.a(kv.af, b, this::a);
      return $$0;
   }

   private cze a(cze $$0) {
      return new cze(this.d.orElseGet($$0::a), this.c.<List<czd>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public exf<ext> b() {
      return exg.K;
   }
}
