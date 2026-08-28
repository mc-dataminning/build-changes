import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddi<T>(ddd a, ddd b, T c, Optional<eza> d) {
   public static <S> Codec<ddi<S>> a(Codec<S> $$0, baj $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  ddd.d.fieldOf("enchanted").forGetter(ddi::a),
                  ddd.d.fieldOf("affected").forGetter(ddi::b),
                  $$0.fieldOf("effect").forGetter(ddi::c),
                  dcw.a($$1).optionalFieldOf("requirements").forGetter(ddi::d)
               )
               .apply($$2, ddi::new)
      );
   }

   public static <S> Codec<ddi<S>> b(Codec<S> $$0, baj $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  ddd.d
                     .validate($$0xx -> $$0xx != ddd.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(ddi::a),
                  $$0.fieldOf("effect").forGetter(ddi::c),
                  dcw.a($$1).optionalFieldOf("requirements").forGetter(ddi::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new ddi<>($$0xx, ddd.c, $$1xx, $$2x))
      );
   }

   public boolean a(evr $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
