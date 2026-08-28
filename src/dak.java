import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dak<T>(dag a, dag b, T c, Optional<evc> d) {
   public static <S> Codec<dak<S>> a(Codec<S> $$0, eul $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dag.d.fieldOf("enchanted").forGetter(dak::a),
                  dag.d.fieldOf("affected").forGetter(dak::b),
                  $$0.fieldOf("effect").forGetter(dak::c),
                  daa.a($$1).optionalFieldOf("requirements").forGetter(dak::d)
               )
               .apply($$2, dak::new)
      );
   }

   public static <S> Codec<dak<S>> b(Codec<S> $$0, eul $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dag.d
                     .validate($$0xx -> $$0xx != dag.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dak::a),
                  $$0.fieldOf("effect").forGetter(dak::c),
                  daa.a($$1).optionalFieldOf("requirements").forGetter(dak::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dak<>($$0xx, dag.c, $$1xx, $$2x))
      );
   }

   public boolean a(err $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
