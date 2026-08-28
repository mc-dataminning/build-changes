import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eyr extends eyb {
   public static final MapCodec<eyr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  eya.e.a(czu.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayi.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyr::new)
   );
   public static final czv b = new czv(0, List.of());
   private final Optional<eya.e<czu>> c;
   private final Optional<Integer> d;

   protected eyr(List<ezx> $$0, Optional<eya.e<czu>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cxh a(cxh $$0, ewo $$1) {
      $$0.a(kv.ah, b, this::a);
      return $$0;
   }

   private czv a(czv $$0) {
      return new czv(this.d.orElseGet($$0::a), this.c.<List<czu>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public eyd<eyr> b() {
      return eye.K;
   }
}
