import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ewf extends evp {
   public static final MapCodec<ewf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  evo.e.a(cyq.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayt.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewf::new)
   );
   public static final cyr b = new cyr(0, List.of());
   private final Optional<evo.e<cyq>> c;
   private final Optional<Integer> d;

   protected ewf(List<exn> $$0, Optional<evo.e<cyq>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwb a(cwb $$0, euc $$1) {
      $$0.a(ku.af, b, this::a);
      return $$0;
   }

   private cyr a(cyr $$0) {
      return new cyr(this.d.orElseGet($$0::a), this.c.<List<cyq>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public evr<ewf> b() {
      return evs.K;
   }
}
