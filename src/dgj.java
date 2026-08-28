import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgj<T>(dge a, dge b, T c, Optional<fdc> d) {
   public static <S> Codec<dgj<S>> a(Codec<S> $$0, bay $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dge.d.fieldOf("enchanted").forGetter(dgj::a),
                  dge.d.fieldOf("affected").forGetter(dgj::b),
                  $$0.fieldOf("effect").forGetter(dgj::c),
                  dfx.a($$1).optionalFieldOf("requirements").forGetter(dgj::d)
               )
               .apply($$2, dgj::new)
      );
   }

   public static <S> Codec<dgj<S>> b(Codec<S> $$0, bay $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dge.d
                     .validate($$0xx -> $$0xx != dge.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dgj::a),
                  $$0.fieldOf("effect").forGetter(dgj::c),
                  dfx.a($$1).optionalFieldOf("requirements").forGetter(dgj::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dgj<>($$0xx, dge.c, $$1xx, $$2x))
      );
   }

   public boolean a(ezt $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
