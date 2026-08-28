import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ewq extends ewa {
   public static final MapCodec<ewq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  evz.e.a(czb.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayv.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewq::new)
   );
   public static final czc b = new czc(0, List.of());
   private final Optional<evz.e<czb>> c;
   private final Optional<Integer> d;

   protected ewq(List<exy> $$0, Optional<evz.e<czb>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwm a(cwm $$0, eun $$1) {
      $$0.a(ku.af, b, this::a);
      return $$0;
   }

   private czc a(czc $$0) {
      return new czc(this.d.orElseGet($$0::a), this.c.<List<czb>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public ewc<ewq> b() {
      return ewd.K;
   }
}
