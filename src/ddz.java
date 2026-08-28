import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddz<T>(ddu a, ddu b, T c, Optional<ezr> d) {
   public static <S> Codec<ddz<S>> a(Codec<S> $$0, bbe $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  ddu.d.fieldOf("enchanted").forGetter(ddz::a),
                  ddu.d.fieldOf("affected").forGetter(ddz::b),
                  $$0.fieldOf("effect").forGetter(ddz::c),
                  ddn.a($$1).optionalFieldOf("requirements").forGetter(ddz::d)
               )
               .apply($$2, ddz::new)
      );
   }

   public static <S> Codec<ddz<S>> b(Codec<S> $$0, bbe $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
                  ddu.d
                     .validate($$0xx -> $$0xx != ddu.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                     .fieldOf("enchanted")
                     .forGetter(ddz::a),
                  $$0.fieldOf("effect").forGetter(ddz::c),
                  ddn.a($$1).optionalFieldOf("requirements").forGetter(ddz::d)
               )
               .apply($$2, ($$0xx, $$1xx, $$2x) -> new ddz<>($$0xx, ddu.c, $$1xx, $$2x))
      );
   }

   public boolean a(ewi $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
