import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgw<T>(dgr a, dgr b, T c, Optional<fds> d) {
   public static <S> Codec<dgw<S>> a(Codec<S> $$0, bbc $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dgr.d.fieldOf("enchanted").forGetter(dgw::a),
                  dgr.d.fieldOf("affected").forGetter(dgw::b),
                  $$0.fieldOf("effect").forGetter(dgw::c),
                  dgk.a($$1).optionalFieldOf("requirements").forGetter(dgw::d)
               )
               .apply($$2, dgw::new)
      );
   }

   public static <S> Codec<dgw<S>> b(Codec<S> $$0, bbc $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  dgr.d
                     .validate($$0xx -> $$0xx != dgr.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(dgw::a),
                  $$0.fieldOf("effect").forGetter(dgw::c),
                  dgk.a($$1).optionalFieldOf("requirements").forGetter(dgw::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new dgw<>($$0xx, dgr.c, $$1xx, $$2x))
      );
   }

   public boolean a(faj $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
