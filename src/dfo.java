import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfo<T>(dfj a, dfj b, T c, Optional<fbw> d) {
   public static <S> Codec<dfo<S>> a(Codec<S> $$0, baw $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dfj.d.fieldOf("enchanted").forGetter(dfo::a),
                  dfj.d.fieldOf("affected").forGetter(dfo::b),
                  $$0.fieldOf("effect").forGetter(dfo::c),
                  dfc.a($$1).optionalFieldOf("requirements").forGetter(dfo::d)
               )
               .apply($$2, dfo::new)
      );
   }

   public static <S> Codec<dfo<S>> b(Codec<S> $$0, baw $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dfj.d
                     .validate($$0xx -> $$0xx != dfj.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dfo::a),
                  $$0.fieldOf("effect").forGetter(dfo::c),
                  dfc.a($$1).optionalFieldOf("requirements").forGetter(dfo::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dfo<>($$0xx, dfj.c, $$1xx, $$2x))
      );
   }

   public boolean a(eyn $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
