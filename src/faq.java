import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class faq extends faa {
   public static final MapCodec<faq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ezz.e.a(dbg.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  ays.k.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, faq::new)
   );
   public static final dbh b = new dbh(0, List.of());
   private final Optional<ezz.e<dbg>> c;
   private final Optional<Integer> d;

   protected faq(List<fbw> $$0, Optional<ezz.e<dbg>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cys a(cys $$0, eyn $$1) {
      $$0.a(kj.aj, b, this::a);
      return $$0;
   }

   private dbh a(dbh $$0) {
      return new dbh(this.d.orElseGet($$0::a), this.c.<List<dbg>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public fac<faq> b() {
      return fad.K;
   }
}
