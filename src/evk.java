import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class evk extends euu {
   public static final MapCodec<evk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  eut.e.a(cyi.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  aym.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evk::new)
   );
   public static final cyj b = new cyj(0, List.of());
   private final Optional<eut.e<cyi>> c;
   private final Optional<Integer> d;

   protected evk(List<ews> $$0, Optional<eut.e<cyi>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cvp a(cvp $$0, eth $$1) {
      $$0.a(kr.aa, b, this::a);
      return $$0;
   }

   private cyj a(cyj $$0) {
      return new cyj(this.d.orElseGet($$0::a), this.c.<List<cyi>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public euw<evk> b() {
      return eux.K;
   }
}
