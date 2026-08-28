import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record deh<T>(dec a, dec b, T c, Optional<ezx> d) {
   public static <S> Codec<deh<S>> a(Codec<S> $$0, bbo $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dec.d.fieldOf("enchanted").forGetter(deh::a),
                  dec.d.fieldOf("affected").forGetter(deh::b),
                  $$0.fieldOf("effect").forGetter(deh::c),
                  ddv.a($$1).optionalFieldOf("requirements").forGetter(deh::d)
               )
               .apply($$2, deh::new)
      );
   }

   public static <S> Codec<deh<S>> b(Codec<S> $$0, bbo $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dec.d
                     .validate($$0xx -> $$0xx != dec.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(deh::a),
                  $$0.fieldOf("effect").forGetter(deh::c),
                  ddv.a($$1).optionalFieldOf("requirements").forGetter(deh::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new deh<>($$0xx, dec.c, $$1xx, $$2x))
      );
   }

   public boolean a(ewo $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
