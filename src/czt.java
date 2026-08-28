import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czt<T>(czp a, czp b, T c, Optional<euf> d) {
   public static <S> Codec<czt<S>> a(Codec<S> $$0, eto $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  czp.d.fieldOf("enchanted").forGetter(czt::a),
                  czp.d.fieldOf("affected").forGetter(czt::b),
                  $$0.fieldOf("effect").forGetter(czt::c),
                  czj.a($$1).optionalFieldOf("requirements").forGetter(czt::d)
               )
               .apply($$2, czt::new)
      );
   }

   public static <S> Codec<czt<S>> b(Codec<S> $$0, eto $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  czp.d
                     .validate($$0xx -> $$0xx != czp.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(czt::a),
                  $$0.fieldOf("effect").forGetter(czt::c),
                  czj.a($$1).optionalFieldOf("requirements").forGetter(czt::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new czt<>($$0xx, czp.c, $$1xx, $$2x))
      );
   }

   public boolean a(equ $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
