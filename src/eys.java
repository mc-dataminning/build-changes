import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eys extends eyc {
   public static final MapCodec<eys> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  eyb.e.a(dae.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  azn.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eys::new)
   );
   public static final daf b = new daf(0, List.of());
   private final Optional<eyb.e<dae>> c;
   private final Optional<Integer> d;

   protected eys(List<ezy> $$0, Optional<eyb.e<dae>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cxp a(cxp $$0, ewp $$1) {
      $$0.a(ku.af, b, this::a);
      return $$0;
   }

   private daf a(daf $$0) {
      return new daf(this.d.orElseGet($$0::a), this.c.<List<dae>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public eye<eys> b() {
      return eyf.K;
   }
}
