import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class evo extends euy {
   public static final MapCodec<evo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  eux.e.a(cyl.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayo.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evo::new)
   );
   public static final cym b = new cym(0, List.of());
   private final Optional<eux.e<cyl>> c;
   private final Optional<Integer> d;

   protected evo(List<eww> $$0, Optional<eux.e<cyl>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cvs a(cvs $$0, etl $$1) {
      $$0.a(ks.aa, b, this::a);
      return $$0;
   }

   private cym a(cym $$0) {
      return new cym(this.d.orElseGet($$0::a), this.c.<List<cyl>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public eva<evo> b() {
      return evb.K;
   }
}
