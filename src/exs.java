import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class exs extends exc {
   public static final MapCodec<exs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  exb.e.a(czc.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ayh.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exs::new)
   );
   public static final czd b = new czd(0, List.of());
   private final Optional<exb.e<czc>> c;
   private final Optional<Integer> d;

   protected exs(List<eyy> $$0, Optional<exb.e<czc>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cwn a(cwn $$0, evp $$1) {
      $$0.a(kv.af, b, this::a);
      return $$0;
   }

   private czd a(czd $$0) {
      return new czd(this.d.orElseGet($$0::a), this.c.<List<czc>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public exe<exs> b() {
      return exf.K;
   }
}
