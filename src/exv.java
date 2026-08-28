import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class exv extends exf {
   public static final MapCodec<exv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  exe.e.a(czf.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayi.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exv::new)
   );
   public static final czg b = new czg(0, List.of());
   private final Optional<exe.e<czf>> c;
   private final Optional<Integer> d;

   protected exv(List<ezb> $$0, Optional<exe.e<czf>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwq a(cwq $$0, evs $$1) {
      $$0.a(kv.af, b, this::a);
      return $$0;
   }

   private czg a(czg $$0) {
      return new czg(this.d.orElseGet($$0::a), this.c.<List<czf>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public exh<exv> b() {
      return exi.K;
   }
}
