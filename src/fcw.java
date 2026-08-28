import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fcw extends fcg {
   public static final MapCodec<fcw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fcf.e.a(dcy.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  azg.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fcw::new)
   );
   public static final dcz b = new dcz(0, List.of());
   private final Optional<fcf.e<dcy>> c;
   private final Optional<Integer> d;

   protected fcw(List<fec> $$0, Optional<fcf.e<dcy>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected dak a(dak $$0, fat $$1) {
      $$0.a(kl.aj, b, this::a);
      return $$0;
   }

   private dcz a(dcz $$0) {
      return new dcz(this.d.orElseGet($$0::a), this.c.<List<dcy>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public fci<fcw> b() {
      return fcj.K;
   }
}
