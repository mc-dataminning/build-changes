import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esx extends esh {
   public static final MapCodec<esx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  esg.e.a(cwu.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  axo.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esx::new)
   );
   public static final cwv b = new cwv(0, List.of());
   private final Optional<esg.e<cwu>> c;
   private final Optional<Integer> d;

   protected esx(List<euf> $$0, Optional<esg.e<cwu>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cuc a(cuc $$0, equ $$1) {
      $$0.a(kn.U, b, this::a);
      return $$0;
   }

   private cwv a(cwv $$0) {
      return new cwv(this.d.orElseGet($$0::a), this.c.<List<cwu>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public esj<esx> b() {
      return esk.K;
   }
}
