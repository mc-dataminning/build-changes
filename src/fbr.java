import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fbr extends fbb {
   public static final MapCodec<fbr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fba.e.a(dby.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayu.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbr::new)
   );
   public static final dbz b = new dbz(0, List.of());
   private final Optional<fba.e<dby>> c;
   private final Optional<Integer> d;

   protected fbr(List<fcx> $$0, Optional<fba.e<dby>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected czk a(czk $$0, ezo $$1) {
      $$0.a(kk.aj, b, this::a);
      return $$0;
   }

   private dbz a(dbz $$0) {
      return new dbz(this.d.orElseGet($$0::a), this.c.<List<dby>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public fbd<fbr> b() {
      return fbe.K;
   }
}
