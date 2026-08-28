import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eyl extends exv {
   public static final MapCodec<eyl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  exu.e.a(czv.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  azd.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyl::new)
   );
   public static final czw b = new czw(0, List.of());
   private final Optional<exu.e<czv>> c;
   private final Optional<Integer> d;

   protected eyl(List<ezr> $$0, Optional<exu.e<czv>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cxg a(cxg $$0, ewi $$1) {
      $$0.a(ku.af, b, this::a);
      return $$0;
   }

   private czw a(czw $$0) {
      return new czw(this.d.orElseGet($$0::a), this.c.<List<czv>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public exx<eyl> b() {
      return exy.K;
   }
}
