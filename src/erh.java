import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class erh extends eqs {
   public static final MapCodec<erh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  cwj.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter($$0x -> $$0x.c),
                  eqr.a(256).forGetter($$0x -> $$0x.d),
                  axn.h.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, erh::new)
   );
   public static final cwk b = new cwk(0, List.of());
   private final List<cwj> c;
   private final eqr d;
   private final Optional<Integer> e;

   protected erh(List<esn> $$0, List<cwj> $$1, eqr $$2, Optional<Integer> $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   protected ctq a(ctq $$0, eph $$1) {
      $$0.a(kb.T, b, this::a);
      return $$0;
   }

   private cwk a(cwk $$0) {
      List<cwj> $$1 = this.d.a($$0.b(), this.c, 256);
      return new cwk(this.e.orElseGet($$0::a), $$1);
   }

   @Override
   public equ b() {
      return eqv.H;
   }
}
