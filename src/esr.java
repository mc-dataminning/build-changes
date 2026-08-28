import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esr extends esb {
   public static final MapCodec<esr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  esa.e.a(cws.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  axm.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esr::new)
   );
   public static final cwt b = new cwt(0, List.of());
   private final Optional<esa.e<cws>> c;
   private final Optional<Integer> d;

   protected esr(List<etz> $$0, Optional<esa.e<cws>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cua a(cua $$0, eqo $$1) {
      $$0.a(kn.U, b, this::a);
      return $$0;
   }

   private cwt a(cwt $$0) {
      return new cwt(this.d.orElseGet($$0::a), this.c.<List<cws>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public esd<esr> b() {
      return ese.K;
   }
}
