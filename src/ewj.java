import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ewj extends evt {
   public static final MapCodec<ewj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  evs.e.a(cyu.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayw.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewj::new)
   );
   public static final cyv b = new cyv(0, List.of());
   private final Optional<evs.e<cyu>> c;
   private final Optional<Integer> d;

   protected ewj(List<exr> $$0, Optional<evs.e<cyu>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwf a(cwf $$0, eug $$1) {
      $$0.a(ku.af, b, this::a);
      return $$0;
   }

   private cyv a(cyv $$0) {
      return new cyv(this.d.orElseGet($$0::a), this.c.<List<cyu>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public evv<ewj> b() {
      return evw.K;
   }
}
