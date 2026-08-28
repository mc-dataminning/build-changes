import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class exu extends exe {
   public static final MapCodec<exu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  exd.e.a(cze.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayi.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exu::new)
   );
   public static final czf b = new czf(0, List.of());
   private final Optional<exd.e<cze>> c;
   private final Optional<Integer> d;

   protected exu(List<eza> $$0, Optional<exd.e<cze>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwp a(cwp $$0, evr $$1) {
      $$0.a(kv.af, b, this::a);
      return $$0;
   }

   private czf a(czf $$0) {
      return new czf(this.d.orElseGet($$0::a), this.c.<List<cze>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public exg<exu> b() {
      return exh.K;
   }
}
