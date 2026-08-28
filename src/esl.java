import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esl extends eru {
   public static final MapCodec<esl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ert.e.a(cxi.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayh.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esl::new)
   );
   public static final cxj b = new cxj(0, List.of());
   private final Optional<ert.e<cxi>> c;
   private final Optional<Integer> d;

   protected esl(List<ets> $$0, Optional<ert.e<cxi>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cup a(cup $$0, eqi $$1) {
      $$0.a(km.U, b, this::a);
      return $$0;
   }

   private cxj a(cxj $$0) {
      return new cxj(this.d.orElseGet($$0::a), this.c.<List<cxi>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public erw<esl> b() {
      return erx.K;
   }
}
