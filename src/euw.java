import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class euw extends eug {
   public static final MapCodec<euw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  euf.e.a(cye.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayl.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, euw::new)
   );
   public static final cyf b = new cyf(0, List.of());
   private final Optional<euf.e<cye>> c;
   private final Optional<Integer> d;

   protected euw(List<ewe> $$0, Optional<euf.e<cye>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cvl a(cvl $$0, est $$1) {
      $$0.a(kr.X, b, this::a);
      return $$0;
   }

   private cyf a(cyf $$0) {
      return new cyf(this.d.orElseGet($$0::a), this.c.<List<cye>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public eui<euw> b() {
      return euj.K;
   }
}
