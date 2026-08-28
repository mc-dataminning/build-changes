import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esj extends ers {
   public static final MapCodec<esj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  err.e.a(cxg.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayf.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esj::new)
   );
   public static final cxh b = new cxh(0, List.of());
   private final Optional<err.e<cxg>> c;
   private final Optional<Integer> d;

   protected esj(List<etq> $$0, Optional<err.e<cxg>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cun a(cun $$0, eqg $$1) {
      $$0.a(km.T, b, this::a);
      return $$0;
   }

   private cxh a(cxh $$0) {
      return new cxh(this.d.orElseGet($$0::a), this.c.<List<cxg>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public eru<esj> b() {
      return erv.K;
   }
}
