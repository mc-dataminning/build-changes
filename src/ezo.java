import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ezo extends eyy {
   public static final MapCodec<ezo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  eyx.e.a(dak.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ays.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ezo::new)
   );
   public static final dal b = new dal(0, List.of());
   private final Optional<eyx.e<dak>> c;
   private final Optional<Integer> d;

   protected ezo(List<fau> $$0, Optional<eyx.e<dak>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cxy a(cxy $$0, exl $$1) {
      $$0.a(kx.ah, b, this::a);
      return $$0;
   }

   private dal a(dal $$0) {
      return new dal(this.d.orElseGet($$0::a), this.c.<List<dak>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public eza<ezo> b() {
      return ezb.K;
   }
}
