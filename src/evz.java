import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class evz extends evj {
   public static final MapCodec<evz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  evi.e.a(cyk.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ays.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evz::new)
   );
   public static final cyl b = new cyl(0, List.of());
   private final Optional<evi.e<cyk>> c;
   private final Optional<Integer> d;

   protected evz(List<exh> $$0, Optional<evi.e<cyk>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cvx a(cvx $$0, etw $$1) {
      $$0.a(kt.ae, b, this::a);
      return $$0;
   }

   private cyl a(cyl $$0) {
      return new cyl(this.d.orElseGet($$0::a), this.c.<List<cyk>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public evl<evz> b() {
      return evm.K;
   }
}
