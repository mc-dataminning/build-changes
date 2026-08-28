import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class esz extends esj {
   public static final MapCodec<esz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  esi.e.a(cwv.c, 256).optionalFieldOf("explosions").forGetter($$0x -> $$0x.c),
                  axo.j.optionalFieldOf("flight_duration").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esz::new)
   );
   public static final cww b = new cww(0, List.of());
   private final Optional<esi.e<cwv>> c;
   private final Optional<Integer> d;

   protected esz(List<euh> $$0, Optional<esi.e<cwv>> $$1, Optional<Integer> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cud a(cud $$0, eqw $$1) {
      $$0.a(kn.U, b, this::a);
      return $$0;
   }

   private cww a(cww $$0) {
      return new cww(this.d.orElseGet($$0::a), this.c.<List<cwv>>map($$1 -> $$1.a($$0.b())).orElse($$0.b()));
   }

   @Override
   public esl<esz> b() {
      return esm.K;
   }
}
