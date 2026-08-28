import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eyk extends exu {
   public static final MapCodec<eyk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ext.e.a(czz.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  azn.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyk::new)
   );
   public static final daa b = new daa(0, List.of());
   private final Optional<ext.e<czz>> c;
   private final Optional<Integer> d;

   protected eyk(List<ezs> $$0, Optional<ext.e<czz>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cxk a(cxk $$0, ewh $$1) {
      $$0.a(ku.af, b, this::a);
      return $$0;
   }

   private daa a(daa $$0) {
      return new daa(this.d.orElseGet($$0::a), this.c.<List<czz>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public exw<eyk> b() {
      return exx.K;
   }
}
