import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dea<T>(ddv a, ddv b, T c, Optional<ezs> d) {
   public static <S> Codec<dea<S>> a(Codec<S> $$0, ezb $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  ddv.d.fieldOf("enchanted").forGetter(dea::a),
                  ddv.d.fieldOf("affected").forGetter(dea::b),
                  $$0.fieldOf("effect").forGetter(dea::c),
                  ddo.a($$1).optionalFieldOf("requirements").forGetter(dea::d)
               )
               .apply($$2, dea::new)
      );
   }

   public static <S> Codec<dea<S>> b(Codec<S> $$0, ezb $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  ddv.d
                     .validate($$0xx -> $$0xx != ddv.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dea::a),
                  $$0.fieldOf("effect").forGetter(dea::c),
                  ddo.a($$1).optionalFieldOf("requirements").forGetter(dea::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dea<>($$0xx, ddv.c, $$1xx, $$2x))
      );
   }

   public boolean a(ewh $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
