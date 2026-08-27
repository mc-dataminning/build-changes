import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class erf extends eqq {
   public static final MapCodec<erf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  cwh.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter($$0x -> $$0x.c),
                  eqp.a(256).forGetter($$0x -> $$0x.d),
                  axm.h.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, erf::new)
   );
   public static final cwi b = new cwi(0, List.of());
   private final List<cwh> c;
   private final eqp d;
   private final Optional<Integer> e;

   protected erf(List<esl> $$0, List<cwh> $$1, eqp $$2, Optional<Integer> $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   protected cto a(cto $$0, epf $$1) {
      $$0.a(kb.T, b, this::a);
      return $$0;
   }

   private cwi a(cwi $$0) {
      List<cwh> $$1 = this.d.a($$0.b(), this.c, 256);
      return new cwi(this.e.orElseGet($$0::a), $$1);
   }

   @Override
   public eqs b() {
      return eqt.H;
   }
}
