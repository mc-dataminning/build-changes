import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esk extends ert {
   public static final MapCodec<esk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ers.e.a(cxh.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayg.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esk::new)
   );
   public static final cxi b = new cxi(0, List.of());
   private final Optional<ers.e<cxh>> c;
   private final Optional<Integer> d;

   protected esk(List<etr> $$0, Optional<ers.e<cxh>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cuo a(cuo $$0, eqh $$1) {
      $$0.a(km.U, b, this::a);
      return $$0;
   }

   private cxi a(cxi $$0) {
      return new cxi(this.d.orElseGet($$0::a), this.c.<List<cxh>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public erv<esk> b() {
      return erw.K;
   }
}
