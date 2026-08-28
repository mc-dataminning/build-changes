import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czu<T>(czq a, czq b, T c, Optional<euh> d) {
   public static <S> Codec<czu<S>> a(Codec<S> $$0, etq $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  czq.d.fieldOf("enchanted").forGetter(czu::a),
                  czq.d.fieldOf("affected").forGetter(czu::b),
                  $$0.fieldOf("effect").forGetter(czu::c),
                  czk.a($$1).optionalFieldOf("requirements").forGetter(czu::d)
               )
               .apply($$2, czu::new)
      );
   }

   public static <S> Codec<czu<S>> b(Codec<S> $$0, etq $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  czq.d
                     .validate($$0xx -> $$0xx != czq.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(czu::a),
                  $$0.fieldOf("effect").forGetter(czu::c),
                  czk.a($$1).optionalFieldOf("requirements").forGetter(czu::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new czu<>($$0xx, czq.c, $$1xx, $$2x))
      );
   }

   public boolean a(eqw $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
